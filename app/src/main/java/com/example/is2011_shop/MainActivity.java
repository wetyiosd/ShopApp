package com.example.is2011_shop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.is2011_shop.addapter.CategoryAdapter;
import com.example.is2011_shop.addapter.CourseAdapter;
import com.example.is2011_shop.model.Category;
import com.example.is2011_shop.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView categoryRecycler, courseRecycler;

    CategoryAdapter categoryAdapter;
    static CourseAdapter courseAdapter;
    static List<Course> courseList = new ArrayList<>();
    static List<Course> fullCourseList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Игры"));
        categoryList.add(new Category(2, "Сайты"));
        categoryList.add(new Category(3, "Языки"));
        categoryList.add(new Category(4, "Прочее"));

        setCategoryRecycler(categoryList);

        courseList.add(new Course(1, "java", "Профессия Java\nразработчик", "1 января", "начальный","#424345", "Test", 3));
        courseList.add(new Course(2, "python", "Профессия Python\nразработчик", "10 января", "начальный","#9FA52D", "Test", 3));
        courseList.add(new Course(3, "unity", "Профессия Unity\nразработчик", "5 января", "начальный","#651730", "Test", 1));
        courseList.add(new Course(4, "front_end", "Профессия Front-end\nразработчик", "10 января", "начальный","#B04935", "Test", 2));
        courseList.add(new Course(5, "back_end", "Профессия Back-end\nразработчик", "8 января", "начальный","#2D55A5", "Test", 2));
        courseList.add(new Course(6, "full_stack", "Профессия Full stack\nразработчик", "7 января", "начальный","#FFC007", "Test", 2));

        fullCourseList.addAll(courseList);

        setCourseRecycler(courseList);
    }

    private void setCourseRecycler(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        courseRecycler = findViewById(R.id.courseRecycler);
        courseRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycler.setAdapter(courseAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }

    public void openShoppingCart(View view) {
        Intent intent = new Intent(this, OrderPage.class);
        startActivity(intent);
    }

    public void openAboutUs(View view) {
        Intent intent = new Intent(this, AboutUsPage.class);
        startActivity(intent);
    }

    public void contactOpen(View view) {
        Intent intent = new Intent(this, contactPage.class);
        startActivity(intent);
    }

    public void allCategories(View view) {
        courseList.clear();
        courseList.addAll(fullCourseList);
        courseAdapter.notifyDataSetChanged();
    }

    public static void showCoursesByCategory(int category) {

        courseList.clear();
        courseList.addAll(fullCourseList);

        List<Course> filterCourses = new ArrayList<>();

        for (Course c : courseList) {
            if (c.getCategory() == category)
                filterCourses.add(c);
        }

        courseList.clear();
        courseList.addAll(filterCourses);

        courseAdapter.notifyDataSetChanged();
    }


}
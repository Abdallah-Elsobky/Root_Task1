package com.example.routetask1;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.routetask1.databinding.ActivityContentBinding;

import java.util.zip.Inflater;

public class ContentActivity extends AppCompatActivity {

    private ActivityContentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityContentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Course course = getIntent().getParcelableExtra(Constants.COURSE_NAME);
        if(course!=null){
            Log.d("ERROR", course.getCourseName());
            binding.courseImg.setImageResource(course.getImageId());
            binding.appBar.setTitle(course.getCourseName()+" Course");
            for(String content:course.getCourseContentList()){
                String res="";
                if(content.charAt(0)=='•'){
                    res+="\t\t"+content+"\n";
                }else{
                    res+="\n"+content+"\n\n";
                }
                binding.courseContent.append(res);
            }
        }else{
            Log.d("ERROR", "Course is null");
        }
    }

}
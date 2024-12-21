package com.example.routetask1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.routetask1.databinding.ActivityCoursesBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoursesActivity extends AppCompatActivity {

    Course android = new Course(R.drawable.android, Constants.android, getContentList(androidContent()));
    Course ios = new Course(R.drawable.ios, Constants.ios, getContentList(iosContent()));
    Course fullstack = new Course(R.drawable.fullstack, Constants.fullstack, getContentList(fullstackContent()));
    private ActivityCoursesBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityCoursesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<Course> courses = Arrays.asList(android, ios, fullstack);
        CourseAdapter adapter = new CourseAdapter(courses);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        binding.rvCourses.setLayoutManager(layoutManager);
        binding.rvCourses.setAdapter(adapter);
    }

    public void clickCourse(View view){
        String courseName = view.getTag().toString();
        Log.d("ERROR", courseName);
        Intent intent = new Intent(CoursesActivity.this, ContentActivity.class);
        switch (courseName){
            case Constants.android:
                intent.putExtra(Constants.COURSE_NAME,android);
                break;
            case Constants.ios:
                intent.putExtra(Constants.COURSE_NAME,ios);
                break;
            case Constants.fullstack:
                intent.putExtra(Constants.COURSE_NAME,fullstack);
                break;
        }
        startActivity(intent);
    }

    public ArrayList<String> getContentList(String content){
        String[] contentLines = content.split("\r?\n");
        return new ArrayList<>(Arrays.asList(contentLines));
    }

    String androidContent(){
        return "Part 1 ( Java SE)\n" +
                "1. Introduction to Java Programming\n" +
                "• Overview.\n" +
                "• Compiler and JVM\n" +
                "• Project Structure\n" +
                "• Hello World Application\n" +
                "• Variables and Data types\n" +
                "• Operators\n" +
                "• Conditional statements ( IF - Switch)\n" +
                "• Loops ( For - While - Do While)\n" +
                "2. Basics\n" +
                "• nested loops\n" +
                "• Strings\n" +
                "• Arrays\n" +
                "• functions\n" +
                "3. Object Oriented Programming\n" +
                "• Classes and Objects\n" +
                "• Encapsulation and data hiding\n" +
                "• Inheritance\n" +
                "• Polymorphism\n" +
                "• Abstraction (Abstract classes - Interfaces)\n" +
                "4. Collections and Generics\n" +
                "• Sets, Lists\n" +
                "• Threading\n" +
                "• Generics Class and MethodPart 2 (Android Development)\n" +
                "1. Introduction to Android\n" +
                "• Android OS\n" +
                "• Android Versions\n" +
                "• OS Architecture\n" +
                "• Application Component\n" +
                "• Android Studio and Gradle\n" +
                "• Creating Hello World\n" +
                "2. UI Components\n" +
                "• Layouts(Constraints Layout- Linear Layout )\n" +
                "• Using resources ( drawables, Strings colors, and Styles )\n" +
                "3. UI Components II\n" +
                "• Menu\n" +
                "• Support Localization\n" +
                "• Support Orientation\n" +
                "4. Intents and Activities\n" +
                "• Intents\n" +
                "• Intent Filters\n" +
                "5. Fragments\n" +
                "• what is fragments\n" +
                "• Fragment manager and transaction\n" +
                "• tablayout, NavigationDrawer, BottomNavigation\n" +
                "6. Dialogs• Alert Dialog\n" +
                "• Display dialog with items\n" +
                "• Custom dialogs (Dialog Fragment)\n" +
                "7. Data Storage\n" +
                "• Shared Preference\n" +
                "• Room (Database Library) - from google Arch Components\n" +
                "8. Threading and Services\n" +
                "• Threading\n" +
                "• Service and Intent Service\n" +
                "9. Web services and APIs\n" +
                "• what is JSON ?\n" +
                "• how to make network calls and APIs\n" +
                "• Consuming Web APIs\n" +
                "• Using Retrofit and Gson Libraries\n" +
                "• how to cache Apis\n" +
                "• using Room and Retrofit Together\n" +
                "• what is Repository Pattern?\n" +
                "10. FireBase RealTime Database\n" +
                "• how to deal with Realtime Database\n" +
                "11. Notifications\n" +
                "• Simple Notification\n" +
                "• firebase to push Notifications\n" +
                "• one signal push notifications SDK\n";
    }
    String iosContent(){
        return "OOP refreshment\n" +
                "A. Introduction\n" +
                "• Installing OS X virtual machine\n" +
                "• Installing Xcode and the iOS SDK\n" +
                "• A guided tour of Xcode\n" +
                "• An Introduction to Xcode playgrounds\n" +
                "B. Swift Programming Language\n" +
                "• Swift Data Types, Constants, and Variables\n" +
                "• Swift Operators and Expressions\n" +
                "• Swift Flow Control\n" +
                "• The Swift Switch Statement\n" +
                "• An Overview of Swift Functions\n" +
                "• The Basics of Object Oriented Programming in Swift\n" +
                "• An Introduction to Swift Subclassing and Extensions\n" +
                "• Working with Array and Dictionary Collections in Swift\n" +
                "• Understanding Error Handling in Swift\n" +
                "C. Views, Layouts, and Storyboards.\n" +
                "• Learning different types of Xcode projects\n" +
                "• Creating first application\n" +
                "• Introduction to application file structure.\n" +
                "• Using Storyboards in Xcode\n" +
                "• Introduction to basic UI Components.\n" +
                "• Creating basic UI Components using Storyboard\n" +
                "• Creating basic UI Components programmatically\n" +
                "• Customizing UI Components.\n" +
                "• An Introduction to Auto Layout in iOS\n" +
                "• Working with iOS Auto Layout Constraints in Interface Builder\n" +
                "• Creating Navigation controller and learning its flow\n" +
                "• Creating tab-based application\n" +
                "• Adding custom fonts\n" +
                "• Creating table view \n" +
                "• Example about gestures\n" +
                "• Creating custom cells for tables\n" +
                "• Animations  \n" +
                "• Examples about subclass\n" +
                "D. Working with local data\n" +
                "• Working with UserDefaults\n" +
                "• Introduction to CoreData\n" +
                "• Introduction to Realm\n" +
                "• Creating data models\n" +
                "• Saving retrieving data\n" +
                "E. ToDo app project\n" +
                "• Implement the interface\n" +
                "• Create realm models\n" +
                "• restore ToDo lists\n" +
                "F. CocoaPods\n" +
                "• Introduction to Cocoapods\n" +
                "• Installing sample pods\n" +
                "• Learning how to use pods in project\n" +
                "• How to look for a useful pod\n" +
                "• Example using Realm database thirdparty\n" +
                "G. Networking\n" +
                "• Working with Alamofire pod\n" +
                "• Installing and configuring Alamofire\n" +
                "• Learning how to send GET \n" +
                "• Learning how to parse JSON responses using ObjectMapper pod\n" +
                "• Creating sample login screen with POST \n" +
                "• Creating sample table view displays data from JSON object\n" +
                "H. Dynamic animator\n" +
                "• Deal with physics engine\n" +
                "• Apply Gravity field to dynamic objects\n" +
                "• Apply collision field to dynamic objects\n" +
                "• Apply other physics fields to dynamic objects\n" +
                "I. Working with Maps\n" +
                "• Introduction to maps\n" +
                "• Showing current user location\n" +
                "• Adding pins\n" +
                "J. Apply some design patterns\n" +
                "• Creational: Singleton.\n" +
                "• Structural: MVC, Decorator, Adapter, Facade.\n" +
                "• Behavioral: Observer\n" +
                "K. Creating final project depends on attendees needs";
    }
    String fullstackContent(){
        return "•HTML\t\n" +
                "•HTML 5 \n" +
                "•CSS\n" +
                "•CSS3\n" +
                "•SASS\n" +
                "•Bootstrap 4\n" +
                "•JavaScript\n" +
                "•Regular expressions\n" +
                "•ECMAScript 6\n" +
                "•JQuery\n" +
                "•angular 7\n" +
                "•fabric.js\n" +
                "•AJAX\n" +
                "•JSON\n" +
                "•Hosting and domains\n" +
                "•Freelancing tips and tricks\n" +
                "•PHP\n" +
                "•MYSQL\n" +
                "•MYSQL advanced queries and triggers\n" +
                "•OOP \n" +
                "•Design Patterns\n" +
                "•MVC\n" +
                "•laravel \n" +
                "•build Api , Api authentication\n" +
                "•connect wordpress with laravel\n" +
                "•build wordpress web service \n" +
                "•agile\n" +
                "•Scrum\n" +
                "•Software development process\n";
    }
}
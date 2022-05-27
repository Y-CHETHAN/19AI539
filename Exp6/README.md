# Ex.No: 6
# Build a program to create a first display screen of any search engine using Auto Complete Text View.

## AIM:

To develop a program to create a first display screen of any search engine using AutoComplete TextView in Android Studio.

## EQUIPMENTS REQUIRED:

Android Studio(Min.required Arctic Fox)

## ALGORITHM:

Step 1: Open Android Studio and then click on File -> New -> New project.

Step 2: Then type the Application name as "searchengine" and click Next. 

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout using AutoComplete TextView in activity_main.xml.

Step 6: Display screen of search engine in MainActivity file.

Step 7: Save and run the application.

<br><br><br><br><br>
## PROGRAM:
```
/*
Program to create a display screen of any search engine.
Developed by        : Y Chethan
Registration Number : 212220230008
*/
```
### MainActivity.java
```
package com.example.searchengine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autotextview;
    String search_engines[] = {"Yahoo", "Google", "MSN", "Bing", "Wiki","YouTube","Baidu","Yandex","DuckDuckGo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autotextview = findViewById(R.id.auto_complete);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,  search_engines);
        autotextview.setThreshold(1);
        autotextview.setAdapter(adapter);
    }
}
```
<br><br><br><br>
### activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:padding="20dp">

    <TextView android:id="@+id/textView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Showing AutoCompleteTextView for Search Engine"
        android:gravity="center"
        android:layout_marginTop="50dp"
        android:textSize="20sp"/>

    <AutoCompleteTextView android:id="@+id/auto_complete"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:textSize="20sp"
        android:hint="Enter here"
        android:layout_below="@id/textView"
        android:layout_marginTop="30dp"/>
</RelativeLayout>
```
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
## OUTPUT:
![image](https://user-images.githubusercontent.com/75234991/169632150-d0bcbbb8-dc53-49e1-b1bd-fb837358d9ea.png)

![image](https://user-images.githubusercontent.com/75234991/169632311-e2c15ffd-5bf0-49a4-881b-2f04ab499c1c.png)

![image](https://user-images.githubusercontent.com/75234991/169635106-7fae9386-3266-47ec-b176-78fb2438fdd3.png)

![image](https://user-images.githubusercontent.com/75234991/169632397-a39471a1-f649-471b-b2b3-cfdd8457ad97.png)

![image](https://user-images.githubusercontent.com/75234991/169635114-e05f0f25-484e-4cb4-8b7d-1561b769e233.png)

## RESULT:
Thus a Simple Android Application to create a first display screen of any search engine using AutoComplete TextView in Android Studio is developed and executed successfully.

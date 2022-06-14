# Ex.No: 1
# To create a HelloWorld Activity using all lifecycles methods to display messages.

## AIM:

To create a HelloWorld Activity using all lifecycles methods to display messages using Android Studio.

## EQUIPMENTS REQUIRED:

Android Studio(Min. required Arctic Fox)

## ALGORITHM:

Step 1: Open Android Studio and then click on File -> New -> New project.

Step 2: Then type the Application name as “ex.no.1″ and click Next. 

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout in activity_main.xml.

Step 6: Display message give in MainActivity file.

Step 7: Save and run the application.

<br><br><br><br><br><br><br><br><br>

## PROGRAM:
```
/*
Program to create and design an android application that draws basic graphical primitives on the screen.
Developed by        : Y Chethan
Registration Number : 212220230008
*/
```
### MainActivity.java:
```
package com.example.exno1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast=Toast.makeText(getApplicationContext(),"OnCreate Invoked",Toast.LENGTH_LONG);
        toast.show();
    }

    protected void onStart(){
        super.onStart();
        Toast toast=Toast.makeText(getApplicationContext(),"OnStart Invoked",Toast.LENGTH_LONG);
        toast.show();
    }

    protected void onResume(){
        super.onResume();
        Toast toast=Toast.makeText(getApplicationContext(),"OnResume Invoked",Toast.LENGTH_LONG);
        toast.show();
    }

    protected void onPause(){
        super.onPause();
        Toast toast=Toast.makeText(getApplicationContext(),"OnPause Invoked",Toast.LENGTH_LONG);
        toast.show();
    }

    protected void onStop(){
        super.onStop();
        Toast toast=Toast.makeText(getApplicationContext(),"OnStop Invoked",Toast.LENGTH_LONG);
        toast.show();
    }

    protected void onRestart(){
        super.onRestart();
        Toast toast=Toast.makeText(getApplicationContext(),"OnRestart Invoked",Toast.LENGTH_LONG);
        toast.show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Toast toast=Toast.makeText(getApplicationContext(),"OnDestroy Invoked",Toast.LENGTH_LONG);
        toast.show();
    }
}
```
### activity_main.xml:
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
## OUTPUT:
![97e98103-6d57-4b4e-a9e6-5a36200ebded](https://user-images.githubusercontent.com/75234991/162582238-7b7185c0-e593-477f-b3dd-52deafb2c79d.jpg)

![b1c60bad-720c-4c0f-9502-9e0579c14c86](https://user-images.githubusercontent.com/75234991/162582053-e2a74d4c-2d53-428c-8f11-56e0c57c99d6.jpg)

![29af8585-effe-4779-b0f8-5f6a0452e76c](https://user-images.githubusercontent.com/75234991/162582077-9e27b901-ce49-49c6-ba8d-d114ab9d5839.jpg)

![ae0f0397-9b08-417e-88dd-9fdf48709b36](https://user-images.githubusercontent.com/75234991/162582089-a196b7cc-d02f-4530-9169-6d5b6a93cf9d.jpg)

![bfc0a74a-3b4f-461d-918e-a1089947ca41](https://user-images.githubusercontent.com/75234991/162582093-641e42cd-8924-41bc-b1f1-9433ed60d483.jpg)

![da47a268-e777-4c38-945d-b2d9999566d7](https://user-images.githubusercontent.com/75234991/162582095-a7b11315-5586-4a41-bc82-2e01df4d769a.jpg)

![5e2f75bf-1714-443c-af23-0e996cd4e009](https://user-images.githubusercontent.com/75234991/162582101-418549e7-72a5-4fa8-9899-034f3bbb6147.jpg)

## RESULT:
Thus a Simple Android Application to create a HelloWorld Activity using all lifecycles methods to display messages using Android Studio is developed and executed successfully.

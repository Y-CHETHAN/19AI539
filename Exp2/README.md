# Ex.No:2 Implicit and Explicit Intents

Develop program to create a text field and a button “Navigate”. When you enter “www.google.com” and press navigate button it should open google page using Implicit Intents and to create two screens , first screen will take one number input from user. After click on Factorial button, second screen will open and it should display factorial of the same number using Explicit Intents.

## AIM:

To create a layout,click button,open google page using Implicit Intents and display factorial number using Explicit Intents in Android Studio.

## EQUIPMENTS REQUIRED:

Android Studio(Min. required Artic Fox)

## ALGORITHM:

Step 1: Open Android Stdio and then click on File -> New -> New project.

Step 2: Then type the Application name as “ex.no.2″ and click Next. 

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout in activity_main.xml.

Step 6: open google page using Implicit Intents and display factorial number using Explicit Intents in MainActivity file.

Step 7: Save and run the application.

## PROGRAM:

```
/*
Program to print the text “Implicit and Explicit Intents”.
Developed by: Y Chethan
Registeration Number : 212220230008
*/
```
### <ins>Impicit Intent</ins>
#### MainActivity.java
```
package com.example.exno2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText =  findViewById(R.id.editText);

        button.setOnClickListener(view -> {
            String url=editText.getText().toString();
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });
    }
}
```
#### activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">


    <EditText
        android:id="@+id/editText"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginEnd="8dp"
        android:ems="10"
        android:importantForAutofill="no"
        android:inputType="text"
        android:minHeight="48dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.589"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.476"
        tools:ignore="LabelFor,TextFields,SpeakableTextPresentCheck" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="156dp"
        android:layout_marginTop="172dp"
        android:text="@string/visit"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.089"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.518" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
### <ins>Explicit Intent</ins>
#### MainActivity.java
```
package com.example.exintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber=findViewById(R.id.etNumber);
    }
    public void displayFactorial(View view){
        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra("number",etNumber.getText().toString());
        startActivity(i);
    }
}
```
#### activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical"
    android:padding="20dp">

    <EditText android:id="@+id/etNumber"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="@string/enter_the_number"
        android:inputType="number"
        android:layout_marginTop="50dp"
        android:importantForAutofill="no" />

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/factorial"
        android:onClick="displayFactorial"/>

</LinearLayout>
```
#### MainActivity2.java
```
package com.example.exintent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b=getIntent().getExtras();
        int no=Integer.parseInt(b.getString("number"));
        long f=1;
        for(int i=no;i>0;i--)
        {
            f=f*i;
        }
        tv=findViewById(R.id.tv);
        tv.setText("Factorial of "+no+" is "+f);
    }
}
```
#### activity_main2.xml
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity2"
    android:padding="20dp">

    <TextView android:id="@+id/tv"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:text="@string/factorial_of_number_is"
        style="@style/TextAppearance.AppCompat.Large"/>

</RelativeLayout>
```

## OUTPUT:

<img width="945" alt="output" src="https://user-images.githubusercontent.com/75234991/163556894-57072e63-5031-4fce-9b66-7a70cbb5c783.png">
<img width="946" alt="output1" src="https://user-images.githubusercontent.com/75234991/163556907-224a0ea1-56e0-42b8-9412-c8c12bbd9b6e.png">
<img width="946" alt="output3" src="https://user-images.githubusercontent.com/75234991/163556914-3c732d73-3406-4ac6-a19d-23ce83a7c2f0.png">
<img width="944" alt="output4" src="https://user-images.githubusercontent.com/75234991/163556932-fa1e79c6-6679-42ee-b713-53d1abfe94ec.png">

## RESULT:

Thus a Simple Android Application to open google page using Implicit Intents and display factorial of the same number using Explicit Intents using Android Studio is developed and executed successfully.

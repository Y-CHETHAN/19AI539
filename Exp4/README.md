# Ex.No:4 Design an android application to send SMS using Intent.

## AIM:

To create and design an android application to send SMS using Intent using Android Studio.

## EQUIPMENTS REQUIRED:

Android Studio(Min. required Arctic Fox)

## ALGORITHM:

Step 1: Open Android Studio and then click on File -> New -> New project.

Step 2: Then type the Application name as “ex.no.4″ and click Next. 

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout in activity_main.xml.

Step 6: Send SMS using Intent give in MainActivity file.

Step 7: Save and run the application.

<br><br><br><br><br><br><br><br><br><br><br><br>

## PROGRAM:

```
/*
Program to create and design an android application to send SMS using Intent.
Developed by        : Y Chethan
Registration Number : 212220230008
*/
```
### MainActivity.java
```
package com.example.exno4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mButton= (Button) findViewById(R.id.send_sms);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms","9443354213",null));
                intent.putExtra("sms_body","Welcome to Android Studio");
                startActivity(intent);
            }
        });
    }
}
```

<br><br><br>

### activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingLeft="16dp"
    android:paddingRight="16dp"
    android:paddingBottom="16dp"
    android:paddingTop="16dp"
    tools:context=".MainActivity">

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/send_sms"
        android:text="@string/click_here_to_send_sms"/>

</RelativeLayout>
```

## OUTPUT:

<img width="960" alt="output1" src="https://user-images.githubusercontent.com/75234991/164279794-7d125569-bea3-4837-801c-3dcfbc09ab61.png">

<img width="960" alt="output2" src="https://user-images.githubusercontent.com/75234991/164279816-b2b588f3-3bc3-4363-b504-e78cd69d920e.png">


## RESULT:

Thus a Simple Android Application create and design an android application to send SMS using Intent using Android Studio is developed and executed successfully.

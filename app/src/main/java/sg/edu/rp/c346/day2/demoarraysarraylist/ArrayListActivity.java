package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        tv = findViewById(R.id.textView2);

        //continue view the code in the worksheet

        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        fruits.add(3,"durian");
        // fruits.add("durian"); can be done this way as well

        // String fruit = fruits.get(1); assigning the elemtnt to a string
        //fruits.remove(0); removing an element
        // fruits.set(fruits.size()-1,"dragon fruit"); to assign an element as the last element.
        // fruits.set(3,"dragon fruit"); can be done this way too because here the last element.


        String text = "Fruits\n";
        text += "=====\n";
        for (int i = 0; i < fruits.size(); i++) {
            text += fruits.get(i) + "\n";
        }

        tv.setText(text);


    }
}
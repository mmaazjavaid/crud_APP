package com.example.crud_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



//    Button buttonAdd, buttonViewAll,delbtn,upbtn;
//    EditText editName, editRollNumber,delroll,uproll;
//    Switch switchIsActive;
//    ListView listViewStudent;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        buttonAdd = findViewById(R.id.buttonAdd);
//        buttonViewAll = findViewById(R.id.buttonViewAll);
//        editName = findViewById(R.id.editTextName);
//        editRollNumber = findViewById(R.id.editTextRollNumber);
//        switchIsActive = findViewById(R.id.switchStudent);
//        listViewStudent = findViewById(R.id.listViewStudent);
//        delbtn=findViewById(R.id.delbtn);
//        upbtn=findViewById(R.id.upbtn);
//        delroll=findViewById(R.id.delroll);
//        uproll=findViewById(R.id.uproll);
//
//        buttonAdd.setOnClickListener(new View.OnClickListener() {
//            StudentModel studentModel;
//
//            @Override
//            public void onClick(View v) {
//                try {
//                    studentModel = new StudentModel(editName.getText().toString(), Integer.parseInt(editRollNumber.getText().toString()), switchIsActive.isChecked());
//                    //Toast.makeText(MainActivity.this, studentModel.toString(), Toast.LENGTH_SHORT).show();
//                }
//                catch (Exception e){
//                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
//                }
//                DBHelper dbHelper  = new DBHelper(MainActivity.this);
//                dbHelper.addStudent(studentModel);
//                editName.setText("");
//                editRollNumber.setText("");
//                switchIsActive.setChecked(false);
//            }
//        });
//
//        delbtn.setOnClickListener(new View.OnClickListener() {
//            StudentModel studentModel;
//            @Override
//            public void onClick(View view) {
//                studentModel = new StudentModel(Integer.parseInt(delroll.getText().toString()));
//                DBHelper dbHelper  = new DBHelper(MainActivity.this);
//                dbHelper.deleteStudent(studentModel);
//                delroll.setText("");
//            }
//        });
//
//        upbtn.setOnClickListener(new View.OnClickListener() {
//            StudentModel studentModel;
//            @Override
//            public void onClick(View view) {
//                try {
//                    studentModel = new StudentModel(editName.getText().toString(), Integer.parseInt(editRollNumber.getText().toString()), switchIsActive.isChecked(),Integer.parseInt(uproll.getText().toString()));
//                    //Toast.makeText(MainActivity.this, studentModel.toString(), Toast.LENGTH_SHORT).show();
//                }
//                catch (Exception e){
//                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
//                }
//                DBHelper dbHelper  = new DBHelper(MainActivity.this);
//                dbHelper.updateStudent(studentModel);
//                editName.setText("");
//                editRollNumber.setText("");
//                uproll.setText("");
//            }
//        });
//
//        buttonViewAll.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                DBHelper dbHelper = new DBHelper(MainActivity.this);
//                List<StudentModel> list = dbHelper.getAllStudents();
//                ArrayAdapter arrayAdapter = new ArrayAdapter<StudentModel>
//                        (MainActivity.this, android.R.layout.simple_list_item_1,list);
//                listViewStudent.setAdapter(arrayAdapter);
//
//            }
//        });

}
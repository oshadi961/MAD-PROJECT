package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Signup_From extends AppCompatActivity {

//    EditText txtfname,txtuname,txtemail,txtaddress,txtNIC,txtpwrd,txtcpwrd,txtphno;
//    Button btnregister;
//   // RadioButton rmale,rfemale;
//    DatabaseReference db, ref,reff;
//    UserLogin  userLogin = new UserLogin();
//    cus_details_add cus = new cus_details_add();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_signup__from);
//
//
//        txtfname = findViewById(R.id.txtfull);
//                txtuname= findViewById(R.id.txtusr);
//        txtemail= findViewById(R.id.txtmail);
//                txtaddress= findViewById(R.id.txtadd);
//        txtpwrd= findViewById(R.id.txtpswrd);
//                txtcpwrd= findViewById(R.id.txtcpswrd);
//        txtphno= findViewById(R.id.txtpno);
//                txtNIC= findViewById(R.id.txtaddd);
//
//        btnregister = findViewById(R.id.btnreg);
//        //rmale =  findViewById(R.id.radmale);
//      //  rfemale= findViewById(R.id.radfemale);
//
//
//
//    }
//
//
//
//
//
//    private void clearControls(){
//
//        txtfname.setText("");
//        txtuname.setText("");
//        txtemail.setText("");
//        txtaddress.setText("");
//        txtNIC.setText("");
//        txtpwrd.setText("");
//        txtcpwrd.setText("");
//        txtphno.setText("");
//        //rmale.setText("");
//        //rfemale.setText("");
//    }
//
//
//    public void reg(View view)
//    {
//        db = FirebaseDatabase.getInstance().getReference().child("cus_details_add");
//
//
//        try {
//            if (TextUtils.isEmpty(txtfname.getText().toString()))
//                Toast.makeText(getApplicationContext(), "Please enter at least two names", Toast.LENGTH_SHORT).show();
//            else if (TextUtils.isEmpty(txtuname.getText().toString()))
//                Toast.makeText(getApplicationContext(), "Please enter at least two names", Toast.LENGTH_SHORT).show();
//            else if (TextUtils.isEmpty(txtemail.getText().toString()))
//                Toast.makeText(getApplicationContext(), "Please enter at least two names", Toast.LENGTH_SHORT).show();
//            else if (TextUtils.isEmpty(txtaddress.getText().toString()))
//                Toast.makeText(getApplicationContext(), "Please enter at least two names", Toast.LENGTH_SHORT).show();
//            else if (TextUtils.isEmpty(txtNIC.getText().toString()))
//                Toast.makeText(getApplicationContext(), "Please enter at least two names", Toast.LENGTH_SHORT).show();
//            else if (TextUtils.isEmpty(txtphno.getText().toString()))
//                Toast.makeText(getApplicationContext(), "Please enter at least two names", Toast.LENGTH_SHORT).show();
//            else if (TextUtils.isEmpty(txtpwrd.getText().toString()))
//                Toast.makeText(getApplicationContext(), "Please enter at least two names", Toast.LENGTH_SHORT).show();
//            else if (TextUtils.isEmpty(txtcpwrd.getText().toString()))
//                Toast.makeText(getApplicationContext(), "Please enter at least two names", Toast.LENGTH_SHORT).show();
//
//            else {
//                cus.setFname(txtfname.getText().toString().trim());
//                cus.setUsrname(txtuname.getText().toString().trim());
//                cus.setEmail(txtemail.getText().toString().trim());
//                cus.setAddress(txtaddress.getText().toString().trim());
//                cus.setPno(txtphno.getText().toString().trim());
//                cus.setPwrd(txtpwrd.getText().toString().trim());
//                cus.setNIC(txtNIC.getText().toString().trim());
//                // cus.setMale(rmale.getText().toString().trim());
//                //cus.setFemale(rfemale.getText().toString().trim());
//
//
//               // db.push().setValue(cus);
//                //db.child("cus1").setValue(cus);
//                db.push();
//                db.child(txtNIC.getText().toString()).setValue(cus);
//                Toast.makeText(getApplicationContext(), "Data Saved Successfully", Toast.LENGTH_SHORT).show();
//                clearControls();
//
//
////
//            }
//        }
//        catch (NumberFormatException e){
//            Toast.makeText(getApplicationContext(),"Invalid Contact number",Toast.LENGTH_SHORT).show();
//        }
//    }
//}




//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.RadioButton;
//import android.widget.Toast;
//
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//
//public class Signup_From extends AppCompatActivity{

    EditText txtfname,txtuname,txtemail,txtaddress,txtpwrd,txtcpwrd,txtphno;
    Button btnregister;
    // RadioButton rmale,rfemale;
    DatabaseReference db;
    cus_details_add cus = new cus_details_add();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup__from);


        txtfname = findViewById(R.id.txtfull);
        txtuname= findViewById(R.id.txtusr);
        txtemail= findViewById(R.id.txtmail);
        txtaddress= findViewById(R.id.txtadd);
        txtpwrd= findViewById(R.id.txtpswrd);
        txtcpwrd= findViewById(R.id.txtcpswrd);
        txtphno= findViewById(R.id.txtpno);

        btnregister = findViewById(R.id.btnreg);
        //rmale =  findViewById(R.id.radmale);
        //  rfemale= findViewById(R.id.radfemale);

    }





    private void clearControls(){

        txtfname.setText("");
        txtuname.setText("");
        txtemail.setText("");
        txtaddress.setText("");
        txtpwrd.setText("");
        txtcpwrd.setText("");
        txtphno.setText("");
        //rmale.setText("");
        //rfemale.setText("");
    }


    public void reg(View view)
    {
        db = FirebaseDatabase.getInstance().getReference().child("cus_details_add");


        try {
            if (TextUtils.isEmpty(txtfname.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please enter at least two names", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(txtuname.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please enter at least two names", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(txtemail.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please enter at least two names", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(txtaddress.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please enter at least two names", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(txtpwrd.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please enter at least two names", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(txtcpwrd.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please enter at least two names", Toast.LENGTH_SHORT).show();

            else {
                cus.setFname(txtfname.getText().toString().trim());
                cus.setUsrname(txtuname.getText().toString().trim());
                cus.setEmail(txtemail.getText().toString().trim());
                cus.setAddress(txtaddress.getText().toString().trim());
                cus.setPno(txtphno.getText().toString().trim());
                cus.setPwrd(txtpwrd.getText().toString().trim());
                cus.setConpwrd(txtcpwrd.getText().toString().trim());
                // cus.setMale(rmale.getText().toString().trim());
                //cus.setFemale(rfemale.getText().toString().trim());

                // db.push().setValue(cus);
                //db.child("cus1").setValue(cus);
                db.push();
                db.child(txtuname.getText().toString()).setValue(cus);
                Toast.makeText(getApplicationContext(), "Data Saved Successfully", Toast.LENGTH_SHORT).show();
                clearControls();

            }
        }
        catch (NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Invalid Contact number",Toast.LENGTH_SHORT).show();
        }
    }
}
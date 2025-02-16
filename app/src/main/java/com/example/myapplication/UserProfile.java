//package com.example.myapplication;
//
//import android.content.Intent;
//import android.content.SharedPreferences;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//import java.util.Locale;
//
//public class UserProfile extends AppCompatActivity {
//
//
//    EditText edit1 , edit2,edit3,edit4,edit5;
//
//    DatabaseReference readref2;
//    cus_details_add cus ;
//
//        TextView dsplyfname,dsplyuname,dsplymail,dsplyadd,dsplypno;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.user_profile);
//
//        cus =  new cus_details_add();
////        SharedPreferences sharedPreferences = getSharedPreferences("login" , 0);
////        String Uname = sharedPreferences.getString("key1", "Not found!");
//
//        String getExtra = getIntent().getStringExtra("UName");
//
//        edit1 = findViewById(R.id.editText);
//        edit2 = findViewById(R.id.editText2);
//        edit3 = findViewById(R.id.editText6);
//        edit4 = findViewById(R.id.editText5);
//        edit5 = findViewById(R.id.editText4);
//
//
////        edit2.setText(Uname);
//
//
////        DatabaseReference readref = FirebaseDatabase.getInstance().getReference().child("cus_details_add").child(edit2.getText().toString());
//        DatabaseReference readref = FirebaseDatabase.getInstance().getReference().child("cus_details_add").child(getExtra);
//        readref.addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                if (dataSnapshot.hasChildren()) {
//                    edit1.setText(dataSnapshot.child("fname").getValue().toString());
//                    edit3.setText(dataSnapshot.child("email").getValue().toString());
//                    edit4.setText(dataSnapshot.child("address").getValue().toString());
//                    edit5.setText(dataSnapshot.child("pno").getValue().toString());
//                       //  pwd = dataSnapshot.child("pwrd").getValue().toString();
//                }
//            }
//
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//
//    }
//
//    protected void onstart(){
//        super.onStart();
//
//        //dsplyfname.setText(data.getfname());
//        //dsplyuname.setText();
//    }
//    public void home(View view){
//
//        Intent i122 = new Intent( UserProfile.this,Grocery.class);
//        startActivity(i122);
//
//
//
//    }
//
//}

package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Locale;

public class UserProfile extends AppCompatActivity {


    EditText edit1 , edit2,edit3,edit4,edit5;

    DatabaseReference readref;
    cus_details_add cus ;

    TextView dsplyfname,dsplyuname,dsplymail,dsplyadd,dsplypno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);

        cus =  new cus_details_add();
        SharedPreferences sharedPreferences = getSharedPreferences("login" , 0);
        String Uname = sharedPreferences.getString("key1", "Not found!");

        edit1 = findViewById(R.id.editText);
        edit2 = findViewById(R.id.editText2);
        edit3 = findViewById(R.id.editText6);
        edit4 = findViewById(R.id.editText5);
        edit5 = findViewById(R.id.editText4);


        edit2.setText(Uname);


        readref = FirebaseDatabase.getInstance().getReference().child("cus_details_add").child(edit2.getText().toString());
        readref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.hasChildren()) {
                    edit1.setText(dataSnapshot.child("fname").getValue().toString());
                    edit3.setText(dataSnapshot.child("email").getValue().toString());
                    edit4.setText(dataSnapshot.child("address").getValue().toString());
                    edit5.setText(dataSnapshot.child("pno").getValue().toString());
                    //  pwd = dataSnapshot.child("pwrd").getValue().toString();
                }
            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

      /*  DatabaseReference updtRef = FirebaseDatabase.getInstance().getReference().child("cus_details_add").child(edit2.getText().toString());
        updtRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.hasChildren()){
                    try {

                        cus.setFname(edit1.getText().toString().trim());
                        cus.setUsrname(edit2.getText().toString().trim());
                        cus.setEmail(edit3.getText().toString().trim());
                        cus.setAddress(edit4.getText().toString().trim());
                        cus.setPno(edit5.getText().toString().trim());

                        db.push();
                        db.child(edit2.getText().toString()).setValue(cus);


                        Toast.makeText(getApplicationContext(), "Successfully updated", Toast.LENGTH_SHORT).show();
                    }
                    catch (NumberFormatException e){
                        Toast.makeText(getApplicationContext(), "Invalid contact number", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                    Toast.makeText(getApplicationContext(), "No source to update", Toast.LENGTH_SHORT).show();
            }







            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });*/

    /*    DatabaseReference delRef = FirebaseDatabase.getInstance().getReference().child("cus_details_add").child(edit2.getText().toString());
        delRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.hasChildren()) {

                    db.removeValue();

                    Toast.makeText(getApplicationContext(), "Successfully Deleted", Toast.LENGTH_SHORT).show();

                } else
                    Toast.makeText(getApplicationContext(), "No source to delete", Toast.LENGTH_SHORT).show();
            }






            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
*/


    }


    protected void onstart(){
        super.onStart();

        //dsplyfname.setText(data.getfname());
        //dsplyuname.setText();
    }
    public void home(View view){

        Intent i122 = new Intent( UserProfile.this,Grocery.class);
        startActivity(i122);



    }

}

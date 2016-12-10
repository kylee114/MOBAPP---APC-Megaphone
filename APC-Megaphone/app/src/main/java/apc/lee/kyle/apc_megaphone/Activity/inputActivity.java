package apc.lee.kyle.apc_megaphone.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import apc.lee.kyle.apc_megaphone.Fragment.HomeFragment;
import apc.lee.kyle.apc_megaphone.R;

import static android.R.attr.button;

/**
 * Created by gc on 12/10/2016.
 */

public class inputActivity extends AppCompatActivity{

    private EditText topic, description;
    private Button submit;

    private DatabaseReference mDatabase;
    private ProgressDialog mProgress;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Forum");

        submit = (Button)findViewById(R.id.btnPost);
        topic = (EditText)findViewById(R.id.ettile);
        description = (EditText)findViewById(R.id.etdescrip);

        mProgress = new ProgressDialog(this);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startPosting();
            }
        });
    }

    private void startPosting() {

        mProgress.setMessage("Posting to forum...");
        mProgress.show();
        String title_val = topic.getText().toString().trim();
        String desc_val = description.getText().toString().trim();

        if(!TextUtils.isEmpty(title_val) && !TextUtils.isEmpty(desc_val)){
            DatabaseReference newPost = mDatabase.push();
            newPost.child("title").setValue(title_val);
            newPost.child("desc").setValue(desc_val);

        startActivity(new Intent(inputActivity.this, MainActivity.class));
        }


    }

}

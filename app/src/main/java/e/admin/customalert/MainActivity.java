package e.admin.customalert;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.activity_custom_alert);
                Button dialogButton = dialog.findViewById(R.id.button);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                        startActivity(new Intent(MainActivity.this, Main2Activity.class));
                        Toast.makeText(getApplicationContext(), "Dissmissed", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();

            }
        });
    }
}

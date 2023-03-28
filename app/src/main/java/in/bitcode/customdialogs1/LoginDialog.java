package in.bitcode.customdialogs1;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginDialog extends Dialog {

    private EditText edtUsername, edtPassword;
    private Button btnSignIn;

    public LoginDialog(Context context) {
        super(context);
        setContentView(R.layout.login_dialog);

        initViews();
        setupListeners();
    }

    private void initViews() {
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
    }

    private void setupListeners() {
        btnSignIn.setOnClickListener(new BtnSignInClickListener());
    }

    private class BtnSignInClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if(edtUsername.getText().toString().equals("bitcode")
                    && edtPassword.getText().toString().equals("bitcode")) {
                dismiss();
                mt(view.getContext(), "Login Successful");
                //start home activity
            }
            else {
                mt(view.getContext(), "Login failed");
            }
        }
    }

    private void mt(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}














package comasdfasdf.hoda.www.a11day;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginFragment extends Fragment {
    EditText et_name,et_pass;
    Button login;
    String name , pass;
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login,container,false);
        et_name = v.findViewById(R.id.et_name);
        et_pass = v.findViewById(R.id.et_pass);
        login = v.findViewById(R.id.bt_login);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = et_name.getText().toString();
                pass = et_pass.getText().toString();
                Toast.makeText(getActivity(), name+"  "+pass, Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }
}
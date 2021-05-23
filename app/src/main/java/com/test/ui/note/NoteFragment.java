package com.test.ui.note;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.test.MainActivity2;
import com.test.R;

public class NoteFragment extends Fragment {

    Button ADDx;
    EditText text_note1x;

    public NoteFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_note, container, false);
        ADDx=root.findViewById(R.id.ADD);
        text_note1x=root.findViewById(R.id.text_note1);

        ADDx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity2.class);
                intent.putExtra("note1",text_note1x.getText().toString());
                startActivity(intent);
            }
        });
        return root;
    }
}
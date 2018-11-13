package com.example.rashidsaleem.albumapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rashidsaleem.albumapp.R;
import com.example.rashidsaleem.albumapp.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentAdapter extends ArrayAdapter<Student> {

    public StudentAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public StudentAdapter(@NonNull Context context, int resource, @NonNull List<Student> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            v = inflater.inflate(R.layout.list_item, null);
        }

        Student student = getItem(position);

        if (student != null) {
            TextView nameView, phoneNoView, addressView;
            ImageView imageView;

            imageView = (ImageView) v.findViewById(R.id.img_pic);
            nameView = (TextView) v.findViewById(R.id.tv_name);
            phoneNoView = (TextView) v.findViewById(R.id.tv_phone_no);
            /*addressView = (TextView) v.findViewById(R.id.tv_address);*/

            imageView.setImageResource(student.getImageId());
            nameView.setText(student.getName());
            phoneNoView.setText(student.getPhoneNo());
            /*addressView.setText(student.getAddress());*/


        }

        return v;
//        return super.getView(position, convertView, parent);
    }
}

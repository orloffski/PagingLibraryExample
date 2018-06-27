package com.example.madcat.paginglibraryexample_1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView carMark;
    private TextView carModel;

    public CarViewHolder(View itemView) {
        super(itemView);

        carMark = itemView.findViewById(R.id.car_mark);
        carModel = itemView.findViewById(R.id.car_model);
    }

    public void bind(Car car){
        carMark.setText(car.getMark());
        carModel.setText(car.getModel());
    }
}

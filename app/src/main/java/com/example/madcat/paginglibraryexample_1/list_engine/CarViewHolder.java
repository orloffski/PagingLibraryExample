package com.example.madcat.paginglibraryexample_1.list_engine;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.madcat.paginglibraryexample_1.R;
import com.example.madcat.paginglibraryexample_1.data.Car;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView carMark;
    private TextView carModel;

    public CarViewHolder(View itemView) {
        super(itemView);

        carMark = itemView.findViewById(R.id.car_mark);
        carModel = itemView.findViewById(R.id.car_model);
    }

    public void bindTo(Car car){
        if(car == null){
            carMark.setText(R.string.wait);
            carModel.setText(R.string.wait);
        }else {
            carMark.setText(car.getMark());
            carModel.setText(car.getModel());
        }
    }

    public void clear(){
        itemView.invalidate();
        carMark.invalidate();
        carModel.invalidate();
    }
}

package com.hoocontrols.hoodb;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

//import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class RoomsFragment extends Fragment {


    int RoomCount = 20;
    public Button button, button1, button2, button3, button4, button5, button6,button_kitchen, button7;
    public Button[] rooms = new Button[RoomCount];
    public String[] roomNames;

    public String rawNames = "Conference Room,Main Hall,Main Power,Office,Rest Room,Rest Room";

    public Button btnBase;
    public ImageView imageView;


    public RoomsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater _inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View _view =  _inflater.inflate(R.layout.fragment_rooms, container, false);

        roomNames = rawNames.split(",");

//        button = _view.findViewById(R.id.b1);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                HomeActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new RoomsFragment(), null).commit();
//            }
//        });

        View view;
        LinearLayout controlsRow = _view.findViewById(R.id.roomControls);
        LayoutInflater inflater = LayoutInflater.from(getActivity());


//        for(int roomid =0; roomid <6 ; roomid++){
//            view = inflater.inflate(R.layout.roomx, controlsRow, false);
//            rooms[roomid] = view.findViewById(R.id.button13);
//            rooms[roomid].setText(roomNames[roomid]);
//            rooms[roomid].setBackgroundResource(R.drawable.tile_blue);
//            rooms[roomid].setCompoundDrawablesWithIntrinsicBounds( 0, R.drawable.mainicons_conf, 0, 0);
//            rooms[roomid].setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    HomeActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new controlsHall(), null).commit();
//                }
//            });
//            controlsRow.addView(view);
//        }
/////////////////////////////////////////////////////////////////////////////////////////////
        /// testing of 4 g
        view = inflater.inflate(R.layout.roomx, controlsRow, false);
        button4 = view.findViewById(R.id.button13);
        button4.setText("testing of 4G");
        button4.setBackgroundResource(R.drawable.tile_red);
        button4.setCompoundDrawablesWithIntrinsicBounds( 0, R.drawable.mainicons_office, 0, 0);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new controls4g(), null).commit();
            }
        });
        controlsRow.addView(view);




        ///////////////////////////////////////////////////////////////////////

        view = inflater.inflate(R.layout.roomx, controlsRow, false);
        button1 = view.findViewById(R.id.button13);
        button1.setText("Conference Room");
        button1.setBackgroundResource(R.drawable.tile_blue);
        button1.setCompoundDrawablesWithIntrinsicBounds( 0, R.drawable.mainicons_conf, 0, 0);
//        button1.setImageResource(R.drawable.conf);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new controlsConf(), null).commit();
            }
        });
        controlsRow.addView(view);

        view = inflater.inflate(R.layout.roomx, controlsRow, false);
        button2 = view.findViewById(R.id.button13);
        button2.setText("Main Hall");
        button2.setBackgroundResource(R.drawable.tile_green);
        button2.setCompoundDrawablesWithIntrinsicBounds( 0, R.drawable.mainicons_hall, 0, 0);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new controlsHall(), null).commit();
            }
        });
        controlsRow.addView(view);

        view = inflater.inflate(R.layout.roomx, controlsRow, false);
        button3 = view.findViewById(R.id.button13);
        button3.setText("Main Power");
        button3.setBackgroundResource(R.drawable.tile_orange);
        button3.setCompoundDrawablesWithIntrinsicBounds( 0, R.drawable.mainicons_power, 0, 0);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new controlsMain(), null).commit();
            }
        });
        controlsRow.addView(view);

        view = inflater.inflate(R.layout.roomx, controlsRow, false);
        button4 = view.findViewById(R.id.button13);
        button4.setText("Office");
        button4.setBackgroundResource(R.drawable.tile_red);
        button4.setCompoundDrawablesWithIntrinsicBounds( 0, R.drawable.mainicons_office, 0, 0);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new controlsOffc(), null).commit();
            }
        });
        controlsRow.addView(view);

        //kitchen
        view = inflater.inflate(R.layout.roomx, controlsRow, false);
        button_kitchen = view.findViewById(R.id.button13);
        button_kitchen.setText("Kitchen");
        button_kitchen.setBackgroundResource(R.drawable.tile_red);
        button_kitchen.setCompoundDrawablesWithIntrinsicBounds( 0, R.drawable.kitchen_icon, 0, 0);
        button_kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new controlsKitchen(), null).commit();
            }
        });
        controlsRow.addView(view);
        //
        view = inflater.inflate(R.layout.roomx, controlsRow, false);
//        imageView = view.findViewById(R.id.imageView);
//        imageView.setImageResource(R.drawable.wr1);
        button5 = view.findViewById(R.id.button13);
        button5.setText("Male Rest Room");
        button5.setBackgroundResource(R.drawable.tile_white);
        button5.setCompoundDrawablesWithIntrinsicBounds( 0, R.drawable.mainicons_wc, 0, 0);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new controlsB1(), null).commit();
            }
        });
        controlsRow.addView(view);

        view = inflater.inflate(R.layout.roomx, controlsRow, false);
        button6 = view.findViewById(R.id.button13);
        button6.setText("Female Rest Room");
        button6.setBackgroundResource(R.drawable.tile_white);
        button6.setCompoundDrawablesWithIntrinsicBounds( 0, R.drawable.mainicons_wc, 0, 0);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new controlsB2(), null).commit();
            }
        });
        controlsRow.addView(view);




        return _view;
    }


}

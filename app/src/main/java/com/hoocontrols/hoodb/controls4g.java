package com.hoocontrols.hoodb;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

//import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class controls4g extends Fragment {


    public controls4g() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater _inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View _view =  _inflater.inflate(R.layout.fragment_controls_hall, container, false);

        LinearLayout controlsRow = _view.findViewById(R.id.controlsHall);
        LayoutInflater inflater = LayoutInflater.from(getActivity());
        View view;
        final Button btnBase, btnControl1, btnControl2, btnControl3,btnControl4,btnControl5,btnControl6,btnControl7,btnControl8;

        //Reading the States Before Rendering
        ((HomeActivity)getActivity()).readBackTrackStates();


        //4 Gang
        view = inflater.inflate(R.layout.button44g, controlsRow, false);
        btnControl1 = view.findViewById(R.id.btn4g_1);
        if(((HomeActivity)getActivity()).Hall_3G_A_1.compareTo("OF2")==0) {
            btnControl1.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));
        }
        else {
            btnControl1.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));
        }
        btnControl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((HomeActivity)getActivity()).Hall_3G_A_1.compareTo("OF2")==0) {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "ON2");
                    ((HomeActivity)getActivity()).Hall_3G_A_1="ON2";
                    btnControl1.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));


                }
                else {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "OF2");
                    ((HomeActivity)getActivity()).Hall_3G_A_1="OF2";
                    btnControl1.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));

                }
                Toast.makeText((HomeActivity) getActivity(), "4g1 Clicked", Toast.LENGTH_LONG).show();
            }
        });
        /////////////////////////////////////
        btnControl2 = view.findViewById(R.id.btn4g_2);
        if(((HomeActivity)getActivity()).Hall_3G_A_2.compareTo("OF2")==0) {
            btnControl2.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));
        }
        else {
            btnControl2.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));
        }
        btnControl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((HomeActivity)getActivity()).Hall_3G_A_2.compareTo("OF2")==0) {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "ON2");
                    ((HomeActivity)getActivity()).Hall_3G_A_2="ON2";
                    btnControl2.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));


                }
                else {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "OF2");
                    ((HomeActivity)getActivity()).Hall_3G_A_2="OF2";
                    btnControl2.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));

                }
                Toast.makeText((HomeActivity) getActivity(), "4g2 Clicked", Toast.LENGTH_LONG).show();
            }
        });
        btnControl3 = view.findViewById(R.id.btn4g_3);
        if(((HomeActivity)getActivity()).Hall_3G_A_3.compareTo("OF3")==0) {
            btnControl3.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));
        }
        else {
            btnControl3.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));
        }
        btnControl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((HomeActivity)getActivity()).Hall_3G_A_3.compareTo("OF3")==0) {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "ON3");
                    ((HomeActivity)getActivity()).Hall_3G_A_3="ON3";
                    btnControl3.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));

                }
                else {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "OF3");
                    ((HomeActivity)getActivity()).Hall_3G_A_3="OF3";
                    btnControl3.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));

                }
                Toast.makeText((HomeActivity) getActivity(), "4g3 Clicked", Toast.LENGTH_LONG).show();
            }
        });

        ////////////////
        btnControl4 = view.findViewById(R.id.btn4g_4);
        if(((HomeActivity)getActivity()).Hall_3G_A_3.compareTo("OF3")==0) {
            btnControl4.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));
        }
        else {
            btnControl4.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));
        }
        btnControl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((HomeActivity)getActivity()).Hall_3G_A_3.compareTo("OF3")==0) {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "ON3");
                    ((HomeActivity)getActivity()).Hall_3G_A_3="ON3";
                    btnControl4.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));

                }
                else {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "OF3");
                    ((HomeActivity)getActivity()).Hall_3G_A_3="OF3";
                    btnControl4.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));

                }
                Toast.makeText((HomeActivity) getActivity(), "4g4 Clicked", Toast.LENGTH_LONG).show();
            }
        });




        controlsRow.addView(view);

        /// //////////4g_socket_1////////////////////
        view = inflater.inflate(R.layout.button4g_potentiometer, controlsRow, false);
        ///////////////////////////////
        /// //////////4g_socket_1////////////////////
        btnControl5 = view.findViewById(R.id.btn4g_1);
        if(((HomeActivity)getActivity()).Hall_3G_A_1.compareTo("OF2")==0) {
            btnControl5.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));
        }
        else {
            btnControl5.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));
        }
        btnControl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((HomeActivity)getActivity()).Hall_3G_A_1.compareTo("OF2")==0) {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "ON2");
                    ((HomeActivity)getActivity()).Hall_3G_A_1="ON2";
                    btnControl5.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));


                }
                else {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "OF2");
                    ((HomeActivity)getActivity()).Hall_3G_A_1="OF2";
                    btnControl5.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));

                }
                Toast.makeText((HomeActivity) getActivity(), "4g_socket_1 Clicked", Toast.LENGTH_LONG).show();
            }
        });
        /////////////////////////////////////



        //controlsRow.addView(view);


///////////////////// 4g_socket_2
        btnControl6 = view.findViewById(R.id.btn4g_2);
        if(((HomeActivity)getActivity()).Hall_3G_A_2.compareTo("OF2")==0) {
            btnControl6.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));
        }
        else {
            btnControl6.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));
        }
        btnControl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((HomeActivity)getActivity()).Hall_3G_A_2.compareTo("OF2")==0) {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "ON2");
                    ((HomeActivity)getActivity()).Hall_3G_A_2="ON2";
                    btnControl6.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));


                }
                else {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "OF2");
                    ((HomeActivity)getActivity()).Hall_3G_A_2="OF2";
                    btnControl6.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));

                }
                Toast.makeText((HomeActivity) getActivity(), "4g_socket_2 Clicked", Toast.LENGTH_LONG).show();
            }
        });
        ///////////////////////////////////// 4g_socket_3

        btnControl7 = view.findViewById(R.id.btn4g_3);
        if(((HomeActivity)getActivity()).Hall_3G_A_3.compareTo("OF2")==0) {
            btnControl7.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));
        }
        else {
            btnControl7.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));
        }
        btnControl7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((HomeActivity)getActivity()).Hall_3G_A_3.compareTo("OF2")==0) {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "ON2");
                    ((HomeActivity)getActivity()).Hall_3G_A_3="ON2";
                    btnControl7.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));


                }
                else {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "OF2");
                    ((HomeActivity)getActivity()).Hall_3G_A_3="OF2";
                    btnControl7.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));

                }
                Toast.makeText((HomeActivity) getActivity(), "4g_socket_3 Clicked", Toast.LENGTH_LONG).show();
            }
        });

/////////////////////////////////////////4g_socket_4////////////////
        btnControl8 = view.findViewById(R.id.btn4g_4);
        if(((HomeActivity)getActivity()).Hall_3G_A_2.compareTo("OF2")==0) {
            btnControl8.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));
        }
        else {
            btnControl8.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));
        }
        btnControl8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((HomeActivity)getActivity()).Hall_3G_A_2.compareTo("OF2")==0) {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "ON2");
                    ((HomeActivity)getActivity()).Hall_3G_A_2="ON2";
                    btnControl8.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_blue));


                }
                else {
                    ((HomeActivity) getActivity()).SwitchCore(((HomeActivity) getActivity()).Hall_3G_A, "OF2");
                    ((HomeActivity)getActivity()).Hall_3G_A_2="OF2";
                    btnControl8.setBackground(ContextCompat.getDrawable(getActivity(), R.drawable.switchbutton_red));

                }
                Toast.makeText((HomeActivity) getActivity(), "4g_socket_4 Clicked", Toast.LENGTH_LONG).show();
            }
        });

        ////////////////////////////////////////////////////////
        controlsRow.addView(view);
        /////////////////////////////////////////////////////8g button8g//////////

        view = inflater.inflate(R.layout.button8g, controlsRow, false);

        controlsRow.addView(view);
        ///////////// button1g with socket
        view = inflater.inflate(R.layout.button_with_socket, controlsRow, false);
        controlsRow.addView(view);
        ///////////// button2g with socket
        view = inflater.inflate(R.layout.button2g_with_socket, controlsRow, false);
        controlsRow.addView(view);
        /////// button 4g with fan
        view = inflater.inflate(R.layout.button4g_socket, controlsRow, false);
        controlsRow.addView(view);
        return _view;
    }

}

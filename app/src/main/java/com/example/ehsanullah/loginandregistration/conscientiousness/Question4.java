package com.example.ehsanullah.loginandregistration.conscientiousness;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.ehsanullah.loginandregistration.Constant;
import com.example.ehsanullah.loginandregistration.MainActivity;
import com.example.ehsanullah.loginandregistration.R;

/**
 * Created by Ehsan Ullah on 4/2/2017.
 */

public class Question4 extends Fragment {

    String q4;
    public Question4(String q4) {
        this.q4 = q4;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.conscientiousness_question_4,container,false);

        TextView tvQuestion4 = (TextView) view.findViewById(R.id.tvQuestion4);
        tvQuestion4.setText(q4);

        ImageButton btnYes = (ImageButton) view.findViewById(R.id.btnYes);
        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Constant.conscientiousnessAnswersList.add(3,"0");//reversed
                Constant.NUM_OF_ATTEMPTED_QUESTIONS +=1;


                String q5 = "after taking bath ... how your washroom looks like?";

                // Startinng an Fragment in question_container
                com.example.ehsanullah.loginandregistration.conscientiousness.Question5 question = new com.example.ehsanullah.loginandregistration.conscientiousness.Question5(q5);
                android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.question_container,question);
                transaction.commit();
            }
        });

        ImageButton btnNo = (ImageButton) view.findViewById(R.id.btnNo);
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Constant.conscientiousnessAnswersList.add(3,"1");//reversed
                Constant.NUM_OF_ATTEMPTED_QUESTIONS +=1;


                String q5 = "after taking bath ... how your washroom looks like?";

                // Startinng an Fragment in question_container
                com.example.ehsanullah.loginandregistration.conscientiousness.Question5 question = new com.example.ehsanullah.loginandregistration.conscientiousness.Question5(q5);
                android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.question_container,question);
                transaction.commit();
            }
        });

        return view;
    }
}


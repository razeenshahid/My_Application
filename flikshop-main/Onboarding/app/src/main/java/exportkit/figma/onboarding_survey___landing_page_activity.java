
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		onboarding_survey___landing_page
	 *	@date 		Saturday 15th of October 2022 12:41:35 AM
	 *	@title 		Visual Design Playground
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.content.Intent;

public class onboarding_survey___landing_page_activity extends Activity {

	
	private View _bg__onboarding_survey___landing_page;
	private TextView welcome_to_flikshop;
	private TextView before_you_pick_your_first_course__we_want_to_learn_a_little_more_about_you_to_customize_your_learning_experience_;
	private ImageView vector;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private ImageView vector_ek4;
	private ImageView vector_ek5;
	private ImageView vector_ek6;
	private ImageView vector_ek7;
	private ImageView vector_ek8;
	private View rectangle_2919;
	private TextView continue_1;
	private ImageView vector_ek9;
	private ImageView pexels_photo_by_elevate;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.onboarding_survey___landing_page);

		
		_bg__onboarding_survey___landing_page = (View) findViewById(R.id._bg__onboarding_survey___landing_page);
		welcome_to_flikshop = (TextView) findViewById(R.id.welcome_to_flikshop);
		before_you_pick_your_first_course__we_want_to_learn_a_little_more_about_you_to_customize_your_learning_experience_ = (TextView) findViewById(R.id.before_you_pick_your_first_course__we_want_to_learn_a_little_more_about_you_to_customize_your_learning_experience_);
		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		vector_ek8 = (ImageView) findViewById(R.id.vector_ek8);
		rectangle_2919 = (View) findViewById(R.id.rectangle_2919);
		continue_1 = (TextView) findViewById(R.id.continue_1);
		vector_ek9 = (ImageView) findViewById(R.id.vector_ek9);
		pexels_photo_by_elevate = (ImageView) findViewById(R.id.pexels_photo_by_elevate);

		// custom code goes here
		// Add buttons
		RelativeLayout con = (RelativeLayout)this.findViewById(R.id.group_5295);
		con.setOnClickListener(new ButtonListener());
	}

	private class ButtonListener implements View.OnClickListener{

		@Override
		public void onClick(View v) {
			Intent intent = new Intent(onboarding_survey___landing_page_activity.this, onboarding_survey___flikshop_tutorial_activity.class);
			startActivity(intent);
		}
	}
}
	
	
package in.myvedik.android.contactus;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.toolbox.ImageLoader;

import java.util.List;

/**
 * Created by admin on 10-01-2017.
 */

public class ContactFragment extends Fragment implements View.OnClickListener{

    private Context context;
    private ImageLoader mImageLoader;
    private static ContactFragment sContactFragment=null;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context= getActivity();
        mImageLoader = MySingleton.getInstance(getActivity()).getImageLoader();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contact, container, false);

        ImageView mSecy_1_ImageView;
        ImageView mSecy_2_ImageView;
        ImageView mJointSecyImageView;
        ImageView mEvents_1_ImageView;
        ImageView mEvents_2_ImageView;
        ImageView mStudentRelations_1_ImageView;
        ImageView mStudentRelations_2_ImageView;
        ImageView mSponsPr_1_ImageView;
        ImageView mSponsPr_2_ImageView;
        ImageView mWebMobOpsImageView;
        ImageView mDesignMediaImageView;
        ImageView mFinance_1_ImageView;
        ImageView mFinance_2_ImageView;
        ImageView mFacReqImageView;
        ImageView mQmsImageView;

        ImageButton mSecy_1_MailButton;
        ImageButton mSecy_2_MailButton;
        ImageButton mJointSecyMailButton;
        ImageButton mEvents_1_MailButton;
        ImageButton mEvents_2_MailButton;
        ImageButton mStudentRelations_1_MailButton;
        ImageButton mStudentRelations_2_MailButton;
        ImageButton mSponsPr_1_MailButton;
        ImageButton mSponsPr_2_MailButton;
        ImageButton mWebMobOpsMailButton;
        ImageButton mDesignMediaMailButton;
        ImageButton mFinance_1_MailButton;
        ImageButton mFinance_2_MailButton;
        ImageButton mFacReqMailButton;
        ImageButton mQmsMailButton;

        ImageButton mSecy_1_PhoneButton;
        ImageButton mSecy_2_PhoneButton;
        ImageButton mJointSecyPhoneButton;
        ImageButton mEvents_1_PhoneButton;
        ImageButton mEvents_2_PhoneButton;
        ImageButton mStudentRelations_1_PhoneButton;
        ImageButton mStudentRelations_2_PhoneButton;
        ImageButton mSponsPr_1_PhoneButton;
        ImageButton mSponsPr_2_PhoneButton;
        ImageButton mWebMobOpsPhoneButton;
        ImageButton mDesignMediaPhoneButton;
        ImageButton mFinance_1_PhoneButton;
        ImageButton mFinance_2_PhoneButton;
        ImageButton mFacReqPhoneButton;
        ImageButton mQmsPhoneButton;

        // Profile Images

        mSecy_1_ImageView=(ImageView)v.findViewById(R.id.secy1_image);
        mSecy_1_ImageView.setTag(context.getResources().getString(R.string.secy1_name));
        setProfileImage(mSecy_1_ImageView);

        mSecy_2_ImageView=(ImageView)v.findViewById(R.id.secy2_image);
        mSecy_2_ImageView.setTag(context.getResources().getString(R.string.secy2_name));
        setProfileImage(mSecy_2_ImageView);

        mJointSecyImageView=(ImageView)v.findViewById(R.id.joint_secy_image);
        mJointSecyImageView.setTag(context.getResources().getString(R.string.joint_secy_name));
        setProfileImage(mJointSecyImageView);

        mEvents_1_ImageView=(ImageView)v.findViewById(R.id.events1_image);
        mEvents_1_ImageView.setTag(context.getResources().getString(R.string.events1_name));
        setProfileImage(mEvents_1_ImageView);

        mEvents_2_ImageView=(ImageView)v.findViewById(R.id.events2_image);
        mEvents_2_ImageView.setTag(context.getResources().getString(R.string.events2_name));
        setProfileImage(mEvents_2_ImageView);


        mStudentRelations_1_ImageView=(ImageView)v.findViewById(R.id.student_relations1_image);
        mStudentRelations_1_ImageView.setTag(context.getResources().getString(R.string.student_relations1_name));
        setProfileImage(mStudentRelations_1_ImageView);

        mStudentRelations_2_ImageView=(ImageView)v.findViewById(R.id.student_relations2_image);
        mStudentRelations_2_ImageView.setTag(context.getResources().getString(R.string.student_relations2_name));
        setProfileImage(mStudentRelations_2_ImageView);

        mSponsPr_1_ImageView=(ImageView)v.findViewById(R.id.spons_pr1_image);
        mSponsPr_1_ImageView.setTag(context.getResources().getString(R.string.spons_pr1_name));
        setProfileImage(mSponsPr_1_ImageView);

        mSponsPr_2_ImageView=(ImageView)v.findViewById(R.id.spons_pr2_image);
        mSponsPr_2_ImageView.setTag(context.getResources().getString(R.string.spons_pr2_name));
        setProfileImage(mSponsPr_2_ImageView);

        mWebMobOpsImageView=(ImageView)v.findViewById(R.id.web_mob_ops_image);
        mWebMobOpsImageView.setTag(context.getResources().getString(R.string.web_mob_ops_name));
        setProfileImage(mWebMobOpsImageView);

        mDesignMediaImageView=(ImageView)v.findViewById(R.id.design_media_image);
        mDesignMediaImageView.setTag(context.getResources().getString(R.string.design_media_name));
        setProfileImage(mDesignMediaImageView);

        mFinance_1_ImageView=(ImageView)v.findViewById(R.id.finance1_image);
        mFinance_1_ImageView.setTag(context.getResources().getString(R.string.finance1_name));
        setProfileImage(mFinance_1_ImageView);

        mFinance_2_ImageView=(ImageView)v.findViewById(R.id.finance2_image);
        mFinance_2_ImageView.setTag(context.getResources().getString(R.string.finance2_name));
        setProfileImage(mFinance_2_ImageView);

        mFacReqImageView=(ImageView)v.findViewById(R.id.fr_image);
        mFacReqImageView.setTag(context.getResources().getString(R.string.fr_name));
        setProfileImage(mFacReqImageView);

        mQmsImageView=(ImageView)v.findViewById(R.id.qms_image);
        mQmsImageView.setTag(context.getResources().getString(R.string.qms_name));
        setProfileImage(mQmsImageView);

        // Profile Images Over

        // Mail


        mSecy_1_MailButton=(ImageButton)v.findViewById(R.id.mail_secy1);
        mSecy_1_MailButton.setTag(R.string.tag_mail,context.getResources().getString(R.string.secy1_email));
        mSecy_1_MailButton.setOnClickListener(this);

        mSecy_2_MailButton=(ImageButton)v.findViewById(R.id.mail_secy2);
        mSecy_2_MailButton.setTag(R.string.tag_mail,context.getResources().getString(R.string.secy2_email));
        mSecy_2_MailButton.setOnClickListener(this);

        mJointSecyMailButton=(ImageButton)v.findViewById(R.id.mail_joint_secy);
        mJointSecyMailButton.setTag(R.string.tag_mail,context.getResources().getString(R.string.joint_secy_email));
        mJointSecyMailButton.setOnClickListener(this);

        mEvents_1_MailButton=(ImageButton)v.findViewById(R.id.mail_events1);
        mEvents_1_MailButton.setTag(R.string.tag_mail,context.getResources().getString(R.string.events1_email));
        mEvents_1_MailButton.setOnClickListener(this);

        mEvents_2_MailButton=(ImageButton)v.findViewById(R.id.mail_events2);
        mEvents_2_MailButton.setTag(R.string.tag_mail,context.getResources().getString(R.string.events2_email));
        mEvents_2_MailButton.setOnClickListener(this);


        mStudentRelations_1_MailButton=(ImageButton)v.findViewById(R.id.mail_student_relations1);
        mStudentRelations_1_MailButton.setTag(R.string.tag_mail,context.getResources().getString(R.string.student_relations1_email));
        mStudentRelations_1_MailButton.setOnClickListener(this);

        mStudentRelations_2_MailButton=(ImageButton)v.findViewById(R.id.mail_student_relations2);
        mStudentRelations_2_MailButton.setTag(R.string.tag_mail,context.getResources().getString(R.string.student_relations2_email));
        mStudentRelations_2_MailButton.setOnClickListener(this);

        mSponsPr_1_MailButton=(ImageButton)v.findViewById(R.id.mail_spons_pr1);
        mSponsPr_1_MailButton.setTag(R.string.tag_mail,context.getResources().getString(R.string.spons_pr1_email));
        mSponsPr_1_MailButton.setOnClickListener(this);

        mSponsPr_2_MailButton=(ImageButton)v.findViewById(R.id.mail_spons_pr2);
        mSponsPr_2_MailButton.setTag(R.string.tag_mail,context.getResources().getString(R.string.spons_pr2_email));
        mSponsPr_2_MailButton.setOnClickListener(this);

        mWebMobOpsMailButton=(ImageButton)v.findViewById(R.id.mail_web_mob_ops);
        mWebMobOpsMailButton.setTag(R.string.tag_mail,context.getResources().getString(R.string.web_mob_ops_email));
        mWebMobOpsMailButton.setOnClickListener(this);

        mDesignMediaMailButton=(ImageButton)v.findViewById(R.id.mail_design_media);
        mDesignMediaMailButton.setTag(R.string.tag_mail,context.getResources().getString(R.string.design_media_email));
        mDesignMediaMailButton.setOnClickListener(this);

        mFinance_1_MailButton=(ImageButton)v.findViewById(R.id.mail_finance1);
        mFinance_1_MailButton.setTag(R.string.tag_mail,context.getResources().getString(R.string.finance1_email));
        mFinance_1_MailButton.setOnClickListener(this);

        mFinance_2_MailButton=(ImageButton)v.findViewById(R.id.mail_finance2);
        mFinance_2_MailButton.setTag(R.string.tag_mail,context.getResources().getString(R.string.finance2_email));
        mFinance_2_MailButton.setOnClickListener(this);

        mFacReqMailButton=(ImageButton)v.findViewById(R.id.mail_fr);
        mFacReqMailButton.setTag(R.string.tag_mail,context.getResources().getString(R.string.fr_email));
        mFacReqMailButton.setOnClickListener(this);

        mQmsMailButton=(ImageButton)v.findViewById(R.id.mail_qms);
        mQmsMailButton.setTag(R.string.tag_mail,context.getResources().getString(R.string.qms_email));
        mQmsMailButton.setOnClickListener(this);

        // Mail Over

        // Phone

        mSecy_1_PhoneButton=(ImageButton)v.findViewById(R.id.phone_secy1);
        mSecy_1_PhoneButton.setTag(R.string.tag_phone,context.getResources().getString(R.string.secy1_phone));
        mSecy_1_PhoneButton.setOnClickListener(this);

        mSecy_2_PhoneButton=(ImageButton)v.findViewById(R.id.phone_secy2);
        mSecy_2_PhoneButton.setTag(R.string.tag_phone,context.getResources().getString(R.string.secy2_phone));
        mSecy_2_PhoneButton.setOnClickListener(this);

        mJointSecyPhoneButton=(ImageButton)v.findViewById(R.id.phone_joint_secy);
        mJointSecyPhoneButton.setTag(R.string.tag_phone,context.getResources().getString(R.string.joint_secy_phone));
        mJointSecyPhoneButton.setOnClickListener(this);

        mEvents_1_PhoneButton=(ImageButton)v.findViewById(R.id.phone_events1);
        mEvents_1_PhoneButton.setTag(R.string.tag_phone,context.getResources().getString(R.string.events1_phone));
        mEvents_1_PhoneButton.setOnClickListener(this);

        mEvents_2_PhoneButton=(ImageButton)v.findViewById(R.id.phone_events2);
        mEvents_2_PhoneButton.setTag(R.string.tag_phone,context.getResources().getString(R.string.events2_phone));
        mEvents_2_PhoneButton.setOnClickListener(this);


        mStudentRelations_1_PhoneButton=(ImageButton)v.findViewById(R.id.phone_student_relations1);
        mStudentRelations_1_PhoneButton.setTag(R.string.tag_phone,context.getResources().getString(R.string.student_relations1_phone));
        mStudentRelations_1_PhoneButton.setOnClickListener(this);

        mStudentRelations_2_PhoneButton=(ImageButton)v.findViewById(R.id.phone_student_relations2);
        mStudentRelations_2_PhoneButton.setTag(R.string.tag_phone,context.getResources().getString(R.string.student_relations2_phone));
        mStudentRelations_2_PhoneButton.setOnClickListener(this);

        mSponsPr_1_PhoneButton=(ImageButton)v.findViewById(R.id.phone_spons_pr1);
        mSponsPr_1_PhoneButton.setTag(R.string.tag_phone,context.getResources().getString(R.string.spons_pr1_phone));
        mSponsPr_1_PhoneButton.setOnClickListener(this);

        mSponsPr_2_PhoneButton=(ImageButton)v.findViewById(R.id.phone_spons_pr2);
        mSponsPr_2_PhoneButton.setTag(R.string.tag_phone,context.getResources().getString(R.string.spons_pr2_phone));
        mSponsPr_2_PhoneButton.setOnClickListener(this);

        mWebMobOpsPhoneButton=(ImageButton)v.findViewById(R.id.phone_web_mob_ops);
        mWebMobOpsPhoneButton.setTag(R.string.tag_phone,context.getResources().getString(R.string.web_mob_ops_phone));
        mWebMobOpsPhoneButton.setOnClickListener(this);

        mDesignMediaPhoneButton=(ImageButton)v.findViewById(R.id.phone_design_media);
        mDesignMediaPhoneButton.setTag(R.string.tag_phone,context.getResources().getString(R.string.design_media_phone));
        mDesignMediaPhoneButton.setOnClickListener(this);

        mFinance_1_PhoneButton=(ImageButton)v.findViewById(R.id.phone_finance1);
        mFinance_1_PhoneButton.setTag(R.string.tag_phone,context.getResources().getString(R.string.finance1_phone));
        mFinance_1_PhoneButton.setOnClickListener(this);

        mFinance_2_PhoneButton=(ImageButton)v.findViewById(R.id.phone_finance2);
        mFinance_2_PhoneButton.setTag(R.string.tag_phone,context.getResources().getString(R.string.finance2_phone));
        mFinance_2_PhoneButton.setOnClickListener(this);

        mFacReqPhoneButton=(ImageButton)v.findViewById(R.id.phone_fr);
        mFacReqPhoneButton.setTag(R.string.tag_phone,context.getResources().getString(R.string.fr_phone));
        mFacReqPhoneButton.setOnClickListener(this);

        mQmsPhoneButton=(ImageButton)v.findViewById(R.id.phone_qms);
        mQmsPhoneButton.setTag(R.string.tag_phone,context.getResources().getString(R.string.qms_phone));
        mQmsPhoneButton.setOnClickListener(this);

        // Phone




        return v;
    }

    private void setProfileImage(ImageView imageView){
        String photo_url= buildUri(imageView.getTag().toString());
        mImageLoader.get(photo_url, ImageLoader.getImageListener(imageView,
                0, R.mipmap.ic_launcher));

    }
    private String buildUri(String name){
        Uri.Builder builder = new Uri.Builder(); // http://mechanica.org.in/assets/team/M%20Vidyadhar.jpg
        builder.scheme("http")
                .authority("mechanica.org.in")
                .appendPath("assets")
                .appendPath("team")
                .appendPath(name+".jpg");
        Log.d("tag",builder.build().toString());
        return builder.build().toString();
    }


    @Override
    public void onClick(View v) {

        if(v.getTag(R.string.tag_mail)!=null){
            String [] email= {v.getTag(R.string.tag_mail).toString()};
            shareToGMail(email,"Mechanica");

        }else if(v.getTag(R.string.tag_phone)!=null){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:"+v.getTag(R.string.tag_phone).toString()));
            startActivity(intent);
        }


    }

    public void shareToGMail(String[] email, String subject) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.putExtra(Intent.EXTRA_EMAIL, email);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        emailIntent.setType("text/plain");
        final PackageManager pm = context.getPackageManager();
        final List<ResolveInfo> matches = pm.queryIntentActivities(emailIntent, 0);
        ResolveInfo best = null;
        for(final ResolveInfo info : matches)
            if (info.activityInfo.packageName.endsWith(".gm") || info.activityInfo.name.toLowerCase().contains("gmail"))
                best = info;
        if (best != null)
            emailIntent.setClassName(best.activityInfo.packageName, best.activityInfo.name);
        context.startActivity(emailIntent);
    }

    public static ContactFragment getInstance(){
        if(sContactFragment==null){
            sContactFragment= new ContactFragment();
        }
        return sContactFragment;
    }
}

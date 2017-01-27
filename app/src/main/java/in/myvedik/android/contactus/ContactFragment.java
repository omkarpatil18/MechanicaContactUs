package in.myvedik.android.contactus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.android.volley.toolbox.ImageLoader;

/**
 * Created by admin on 10-01-2017.
 */

public class ContactFragment extends Fragment{
    private ImageView mSecy_1_ImageView;
    private ImageView mSecy_2_ImageView;
    private ImageView mJointSecyImageView;
    private ImageView mEvents_1_ImageView;
    private ImageView mEvents_2_ImageView;
    private ImageView mStudentRelations_1_ImageView;
    private ImageView mStudentRelations_2_ImageView;
    private ImageView mSponsPr_1_ImageView;
    private ImageView mSponsPr_2_ImageView;
    private ImageView mWebMobOpsImageView;
    private ImageView mDesignMediaImageView;
    private ImageView mFinance_1_ImageView;
    private ImageView mFinance_2_ImageView;
    private ImageView mFacReqImageView;
    private ImageView mQmsImageView;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.fragment_contact, container, false);

        /*
        mSecy_1_ImageView=v.findViewById(R.id.secy);
        mSecy_1_ImageView.setTag(R.string.secy1_name);
        mSecy_2_ImageView;
        mJointSecyImageView;
        mEvents_1_ImageView;
        mEvents_2_ImageView;
        mStudentRelations_1_ImageView;
        mStudentRelations_2_ImageView;
        mSponsPr_1_ImageView;
        mSponsPr_2_ImageView;
        mWebMobOpsImageView;
        mDesignMediaImageView;
        mFinance_1_ImageView;
        mFinance_2_ImageView;
        mFacReqImageView;
        mQmsImageView;
*/



        return v;
    }

    private void setProfileImage(ImageView imageView){
        ImageLoader mImageLoader = MySingleton.getInstance(getActivity()).getImageLoader();
        mImageLoader.get(imageView.getTag().toString(), ImageLoader.getImageListener(imageView,
                0, 0));

    }
    private void buildUri(){

    }


}

package android.bignerdranch.com;

import androidx.fragment.app.Fragment;

public class PhotoGalleryActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
            return PhotoGalleryFragment.newInstance();
        }
}


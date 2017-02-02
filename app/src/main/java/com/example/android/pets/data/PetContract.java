package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Amanda on 1/31/2017.
 */

public final class PetContract {

    /* Inner class that defines the table contents */
    public static class PetEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for gender of the pet.
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}

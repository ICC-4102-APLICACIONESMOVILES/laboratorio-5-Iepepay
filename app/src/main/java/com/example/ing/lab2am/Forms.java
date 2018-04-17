package com.example.ing.lab2am;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.text.Normalizer;

@Entity
public class Forms {


        public void setFormId(@NonNull int formId) {
                FormId = formId;
        }

        @NonNull
        @PrimaryKey (autoGenerate = true)
        private int FormId;
        private String FormName;

        public Forms() {
        }

        public int getFormId() { return FormId; }
        public String getFormName() { return FormName; }
        public void setFormName (String FormName) { this.FormName = FormName; }


}

package edu.cuny.qc.cs.medication_management.controllers;

import androidx.fragment.app.Fragment;

import java.io.IOException;

public class ViewLinksActivity extends SingleFragmentActivity{
    protected Fragment createFragment() throws IOException {
        //checks();
        return new ViewLinksFragment();
    }
}
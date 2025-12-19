package com.example.demo.service;

import com.example.demo.model.RecoveryCurve;
import com.example.demo.model.RecoveryCurveProfile;
import java.util.List;

public interface RecoveryCurveService {

    RecoveryCurve createCurveEntry(RecoveryCurveProfile entry);

    RecoveryCurve getCurveForSurgery(String surgeryType);

    List<RecoveryCurve> getAllCurves();
}

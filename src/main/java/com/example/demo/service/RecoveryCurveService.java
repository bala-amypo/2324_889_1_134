package com.example.demo.service;

import com.example.demo.model.RecoveryCurve;

public interface RecoveryCurveService{
`
    RecoveryCurve createCurveEntry(RecoveryCurveProfile entry);

    RecoveryCurve getCurveForSurgery(String surgeryType);

    List<RecoveryCurve> getAllCurves();
}
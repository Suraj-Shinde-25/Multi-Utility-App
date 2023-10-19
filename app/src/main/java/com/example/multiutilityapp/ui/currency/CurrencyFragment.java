package com.example.multiutilityapp.ui.currency;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import com.example.multiutilityapp.R;

public class CurrencyFragment extends Fragment {

    private EditText amountEditText;
    private Spinner currencySpinner;
    private Button convertButton;
    private TextView resultTextView;


    private static final double IND_TO_USD_RATE = 0.012,
            IND_TO_CD_RATE = 0.016, IND_TO_CY_RATE = 0.088, IND_TO_EURO_RATE = 0.011,
            IND_TO_HKD_RATE = 0.094, IND_TO_SKW_RATE = 16.23, IND_TO_RR_RATE = 1.17,
            IND_TO_JY_RATE = 1.80, IND_TO_SD_RATE = 0.016, IND_TO_SLR_RATE = 3.90,
            IND_TO_PR_RATE = 3.36, IND_TO_UAED_RATE = 0.044;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_currency, container, false);

        amountEditText = view.findViewById(R.id.amountEditText);
        currencySpinner = view.findViewById(R.id.currencySpinner);
        convertButton = view.findViewById(R.id.convertButton);
        resultTextView = view.findViewById(R.id.resultTextView);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                getActivity(), R.array.currencies, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        currencySpinner.setAdapter(adapter);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertCurrency();
            }
        });

        return view;
    }

    private void convertCurrency() {
        String amountString = amountEditText.getText().toString();
        if (!amountString.isEmpty()) {
            double amount = Double.parseDouble(amountString);
            String selectedCurrency = currencySpinner.getSelectedItem().toString();

            double convertedAmount = 0;
            if (selectedCurrency.equals("United States Dollar")) {
                convertedAmount = amount * IND_TO_USD_RATE;
            } else if (selectedCurrency.equals("Canadian Dollar")) {
                convertedAmount = amount * IND_TO_CD_RATE;
            }else if (selectedCurrency.equals("Chinese Yuan")) {
                convertedAmount = amount * IND_TO_CY_RATE;
            }else if (selectedCurrency.equals("Euro")) {
                convertedAmount = amount * IND_TO_EURO_RATE;
            }else if (selectedCurrency.equals("Hong Kong Dollar")) {
                convertedAmount = amount * IND_TO_HKD_RATE;
            }else if (selectedCurrency.equals("South Korean won")) {
                convertedAmount = amount * IND_TO_SKW_RATE;
            }else if (selectedCurrency.equals("Russian Ruble")) {
                convertedAmount = amount * IND_TO_RR_RATE;
            }else if (selectedCurrency.equals("Japanese Yen")) {
                convertedAmount = amount * IND_TO_JY_RATE;
            }else if (selectedCurrency.equals("Singapore Dollar")) {
                convertedAmount = amount * IND_TO_SD_RATE;
            }else if (selectedCurrency.equals("Sri Lankan Rupee")) {
                convertedAmount = amount * IND_TO_SLR_RATE;
            }else if (selectedCurrency.equals("Pakistan Rupee")) {
                convertedAmount = amount * IND_TO_PR_RATE;
            }else if (selectedCurrency.equals("UAE Dirham")) {
                convertedAmount = amount * IND_TO_UAED_RATE;
            }

            resultTextView.setText(String.format("%.2f %s", convertedAmount, selectedCurrency));
        } else {
            resultTextView.setText("Enter valid amount.");
        }
    }
}

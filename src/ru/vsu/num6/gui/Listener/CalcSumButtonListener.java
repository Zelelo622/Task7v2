package ru.vsu.num6.gui.Listener;

import ru.vsu.num6.logic.SumArrayElements;
import ru.vsu.num6.gui.utils.ArrayUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcSumButtonListener implements ActionListener {

    private JTextField inputArrText;
    private JTextField outputArrText;

    public CalcSumButtonListener(JTextField inputArrText, JTextField outputArrText) {
        this.inputArrText = inputArrText;
        this.outputArrText = outputArrText;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        SumArrayElements sumArrayElements = new SumArrayElements();
        String inputText = inputArrText.getText();
        int[] array = ArrayUtil.toIntArray(inputText);
        int sumElement = sumArrayElements.getSumOfElements(array);
        outputArrText.setText(String.valueOf(sumElement));
    }
}

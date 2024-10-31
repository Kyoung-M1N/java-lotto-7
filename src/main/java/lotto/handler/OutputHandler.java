package lotto.handler;

import java.util.List;

import lotto.domain.WinningLotto;
import lotto.view.OutputView;

public class OutputHandler {
    private final OutputView outputView = new OutputView();

    public void printPurchaseResult(int count, List<WinningLotto> winningLottos) {
        outputView.printCount(count);
        outputView.printNumbers(winningLottos);
    }

    public void printLottoResult(List<Double> matchCounts, double rateOfReturn) {
        outputView.printLottoResult(matchCounts);
        outputView.printRateOfReturn(rateOfReturn);
    }
}

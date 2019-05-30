package lotto.model.creator;

import lotto.model.object.BonusBall;

public class BonusBallCreator {
        public static BonusBall create(final int number) {
                return new BonusBall(LottoNumberCreator.create(number));
        }
}

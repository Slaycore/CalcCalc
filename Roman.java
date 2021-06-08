public enum Roman {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);
    private int flip;

    Roman(int flip) {
        this.flip = flip;
    }

    public int getFlip() {
        return flip;
    }

    public void romanToInt (Roman toInt) {
        switch (toInt) {
            case I:
                getFlip();
                break;
            case II:
                getFlip();
                break;
            case III:
                getFlip();
                break;
            case IV:
                getFlip();
                break;
            case V:
                getFlip();
                break;
            case VI:
                getFlip();
                break;
            case VII:
                getFlip();
                break;
            case VIII:
                getFlip();
                break;
            case IX:
                getFlip();
                break;
            case X:
                getFlip();
                break;
        }
    }
}
package wayic.Waybrec.parser;


public class Typestamp extends Breccia.parser.Typestamp {


    protected Typestamp() {}



   // ━━━  F r a c t a l   s t a r t  ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━


    /** The lowest of the typestamps defined here.
      */
    protected static final int WaybrecMinimum            = -0x01; // = ↓



    /** The typestamp of `ThoroughfractumDesignator`.
      */
    public static final int thoroughfractumDesignator    = -0x01; // = ↑



   // ━━━  F r a c t a l   e n d  ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━


    /** The typestamp of `ThoroughfractumDesignator.End`.
      */
    public static final int thoroughfractumDesignatorEnd = 0x0e; // = ↓



    /** The highest of the typestamps defined here.
      */
    protected static final int WaybrecMaximum            = 0x0e; // = ↑



    static {
        assert thoroughfractumDesignator + 1 == BrecciaMinimum;
        assert thoroughfractumDesignatorEnd == BrecciaMaximum + 1; }}



                                                        // Copyright © 2021  Michael Allan.  Licence MIT.

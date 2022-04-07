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
    static { assert thoroughfractumDesignator/*last of the fractal starts*/ == BrecciaMinimum - 1; }



   // ━━━  F r a c t a l   e n d  ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━


    /** The typestamp of `ThoroughfractumDesignator.End`.
      */
    public static final int thoroughfractumDesignatorEnd = 0x14;   // = ↓
    static { assert thoroughfractumDesignatorEnd/*first of the fractal ends*/ == BrecciaMaximum + 1; }



    /** The highest of the typestamps defined here.
      */
    protected static final int WaybrecMaximum            = 0x14; } // = ↑



                                                   // Copyright © 2021-2022  Michael Allan.  Licence MIT.

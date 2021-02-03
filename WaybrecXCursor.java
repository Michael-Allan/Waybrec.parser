package wayic.Waybrec.parser;

import Breccia.parser.BrecciaXCursor;


/** A reusable translator of Waybrec to X-Waybrec.
  */
public class WaybrecXCursor extends BrecciaXCursor {


    /** @see #sourceCursor()
      */
    public WaybrecXCursor( WaybrecCursor sourceCursor ) { super( sourceCursor ); }



    public @Override WaybrecCursor sourceCursor() { return (WaybrecCursor)super.sourceCursor(); }}



                                                   // Copyright © 2020-2021  Michael Allan.  Licence MIT.

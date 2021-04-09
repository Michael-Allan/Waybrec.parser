package wayic.Waybrec.parser;

import Breccia.parser.plain.CommandPoint_;
import Breccia.parser.plain.SimpleCommandPoint;


/** @param <C> The type of cursor.
  */
class ThoroughfractumDesignator_ extends SimpleCommandPoint<WaybrecCursor>
  implements ThoroughfractumDesignator {


    ThoroughfractumDesignator_( WaybrecCursor cursor ) { super( cursor ); }



    ThoroughfractumDesignator_ endSet() {
        end = new End_();
        return this; }



   // ━━━  C o m m a n d   P o i n t _  ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━


    protected @Override void commit() {
        super.commit();
        cursor.thoroughfractumDesignator( this ); }



   // ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀


    class End_ extends CommandPoint_<WaybrecCursor>.End_ implements ThoroughfractumDesignator.End {


        protected @Override void commit() {
            super.commit();
            cursor.thoroughfractumDesignatorEnd( this ); }}}



                                                        // Copyright © 2021  Michael Allan.  Licence MIT.

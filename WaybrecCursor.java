package wayic.Waybrec.parser;

import Breccia.parser.plain.BrecciaCursor;


/** A reusable, pull parser of Waybrec as reflected through a cursor.
  */
public class WaybrecCursor extends BrecciaCursor {


    public WaybrecCursor() {
        final String[] commandPointKeywords = { // Those specific to Waybrec, in lexicographic order.
            "thoroughfractum" };
        final Runnable[] commandPointCommitters = { // Each at the same index as its keyword above.
            basicThoroughfractumDesignator::commit }; // ‘thoroughfractum’
        addCommandPoints( commandPointKeywords, commandPointCommitters ); }



////  P r i v a t e  ////////////////////////////////////////////////////////////////////////////////////


   // ┈┈┈  s t a t e   t y p i n g  ┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈


    final void thoroughfractumDesignator( ThoroughfractumDesignator p ) {
        thoroughfractumDesignator = p; }


        private ThoroughfractumDesignator thoroughfractumDesignator;


        private final ThoroughfractumDesignator_ basicThoroughfractumDesignator // [CIC]
           = new ThoroughfractumDesignator_( this ).endSet();



    final void thoroughfractumDesignatorEnd( ThoroughfractumDesignator.End e ) {
        thoroughfractumDesignatorEnd = e; }


        private ThoroughfractumDesignator.End thoroughfractumDesignatorEnd; }



// NOTE
// ────
//   CIC  Cached instance of concrete parse state.  See namesake note of parent class.
//        http://reluk.ca/project/Breccia/parser/plain/BrecciaCursor.java



                                                   // Copyright © 2020-2021  Michael Allan.  Licence MIT.

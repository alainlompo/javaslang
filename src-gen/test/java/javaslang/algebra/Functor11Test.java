/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang.algebra;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import static org.assertj.core.api.Assertions.assertThat;

import javaslang.Function1;
import javaslang.Function11;
import javaslang.Tuple11;
import org.junit.Test;

public class Functor11Test {

    @Test
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> void shouldMapComponentsSeparately() {
        final Functor11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> functor = new Functor11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>() {
            @SuppressWarnings("unchecked")
            @Override
            public <U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11> Functor11<U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11> map(Function11<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, Tuple11<? extends U1, ? extends U2, ? extends U3, ? extends U4, ? extends U5, ? extends U6, ? extends U7, ? extends U8, ? extends U9, ? extends U10, ? extends U11>> f) {
                return (Functor11<U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11>) this;
            }
        };
        final Functor11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> actual = functor.map(Function1.identity(), Function1.identity(), Function1.identity(), Function1.identity(), Function1.identity(), Function1.identity(), Function1.identity(), Function1.identity(), Function1.identity(), Function1.identity(), Function1.identity());
        assertThat(actual).isNotNull();
    }
}
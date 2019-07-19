/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.drill.exec.expr.holders;

import org.apache.drill.common.types.TypeProtos;
import org.apache.drill.common.types.Types;
import org.apache.drill.exec.vector.complex.MapVector;
import org.apache.drill.exec.vector.complex.reader.FieldReader;

public final class RepeatedMapHolder implements ValueHolder{

    public static final TypeProtos.MajorType TYPE = Types.repeated(TypeProtos.MinorType.MAP);

//    public final LinkedHashSet<ValueHolder> children = null;

    public TypeProtos.MajorType getType() {return TYPE;}

    /** The first index (inclusive) into the Vector. **/
    public int start;

    /** The last index (exclusive) into the Vector. **/
    public int end;

    /** The Vector holding the actual values. **/
    public MapVector vector;

    public FieldReader reader;

}
/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.fluent.standard;

import org.drools.fluent.FluentBase;
import org.drools.fluent.FluentPath;
import org.drools.fluent.FluentRoot;
import org.drools.fluent.FluentStep;
import org.drools.fluent.FluentTest;

public interface FluentStandardSimulation extends FluentBase, FluentRoot, FluentTest<FluentStandardSimulation> {
    
    FluentStandardPath newPath(String name);
    
    FluentStandardPath getPath(String name);   
    
}
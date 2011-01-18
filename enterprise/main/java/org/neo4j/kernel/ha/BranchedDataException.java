/**
 * Copyright (c) 2002-2011 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.kernel.ha;

/**
 * Thrown to point out that branching of data has occured for one or
 * more instances in a cluster. Branching is when one machine has
 * different (not meaning outdated) than the current master.
 * 
 * @author Mattias Persson
 */
public class BranchedDataException extends IllegalStateException
{
    public BranchedDataException()
    {
        super();
    }

    public BranchedDataException( String message, Throwable cause )
    {
        super( message, cause );
    }

    public BranchedDataException( String message )
    {
        super( message );
    }

    public BranchedDataException( Throwable cause )
    {
        super( cause );
    }
}

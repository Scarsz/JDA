/*
 *     Copyright 2015-2016 Austin Keener & Michael Ritter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dv8tion.jda.core.events.role;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.Role;

/**
 * <b><u>RoleCreateEvent</u></b><br>
 * Fired if a {@link net.dv8tion.jda.core.entities.Role Role} is created.<br>
 * <br>
 * Use: Retrieve created Role and it's Guild.
 */
public class RoleCreateEvent extends GenericRoleEvent
{
    public RoleCreateEvent(JDA api, long responseNumber, Role createdRole)
    {
        super(api, responseNumber, createdRole);
    }
}

/*  Tigase Jabber/XMPP Server
 *  Copyright (C) 2004-2012 "Artur Hefczyc" <artur.hefczyc@tigase.org>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. Look for COPYING file in the top folder.
 * If not, see http://www.gnu.org/licenses/.
 *
 * $Rev: $
 * Last modified by $Author: $
 * $Date: $
 */
package tigase.server.bosh;

import java.util.TimerTask;

/**
 *
 * @author andrzej
 */
public class BoshSendQueueTask extends TimerTask {

        private final BoshSession bs;
        
        public BoshSendQueueTask(BoshSession bs) {
                this.bs = bs;
        }

        @Override
        public void run() {
                bs.sendWaitingPackets();
        }
        
}

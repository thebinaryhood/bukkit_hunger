/*The MIT License

Copyright (c) 2012 Mark Lohstroh

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/

package net.evtr.hungergames;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class EntityListener implements Listener 
{
	private HungerGames plugin;
	
	public EntityListener(HungerGames instance)
	{
		plugin = instance;
	}
	
	@EventHandler
	public void CreatureSpawn(CreatureSpawnEvent event)
	{
		event.setCancelled(true);
	}
	
	@EventHandler
	public void OnPlayerInteract(PlayerInteractEvent event)
	{

	}
	
	@EventHandler
	public void OnPlayerDeath(PlayerDeathEvent event)
	{
		plugin.log.info("player died...");
		plugin.log.info(event.getEntity().getDisplayName() + " has been killed by " + event.getEntity().getKiller().getDisplayName()); //TODO: raises error if not killed by player!
	}
}

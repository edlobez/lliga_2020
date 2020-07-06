/*
 * Copyright (C) 2019 edlobez-vbox
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edlobez.es.controller;

/**
 *
 * @author edlobez-vbox
 */
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping(value = {"/", "/home"})
    public String home() {  

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        
        String mv = "404";
        
        if (auth.getAuthorities().contains(new SimpleGrantedAuthority("admin"))) {            
            mv = "redirect:/admin/home";                       
        }/* else if (auth.getAuthorities().contains(new SimpleGrantedAuthority("invitado"))){
            mv = "redirect:/invitado/home";
        } */
        return mv;
    }

}
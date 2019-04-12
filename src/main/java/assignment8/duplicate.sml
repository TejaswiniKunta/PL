fun duplicate(xx) =
  reverse(let fun dup(x,z) =
      if x = [] then z
      else
      let val double = hd(x)::z in dup(tl(x),hd(x)::double) end
      in dup(xx,[]) end);

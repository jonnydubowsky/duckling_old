(
    ;; Temperature 

    ; latent temperature
    "number as temp"
    (dim :number)
    {:dim :temperature
     :latent true
     :value (:value %1)}

    "<latent temp> degrees"
    [(dim :temperature) #"(?i)(grad[io]?\.?)|°"]
    (-> %1 (dissoc :latent)
           (merge {:unit "degree"}))

    "<temp> Celcius"
    [(dim :temperature) #"(?i)(c((el[cs]?(ius)?)|(entigrad[io]))?\.?)"]
    (-> %1 (dissoc :latent)
           (merge {:unit "celsius"}))

    "<temp> Fahrenheit"
    [(dim :temperature) #"(?i)f(ah?rh?eh?n(h?eit)?)?\.?"]
    (-> %1 (dissoc :latent)
           (merge {:unit "fahrenheit"}))

)

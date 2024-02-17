def city_function(city,country,population=''):
    if population:
        city_name = f"{city}, {country} - population {population}"
        return city_name.title()
    else:
        city_name = f"{city}, {country}"
        return city_name.title()


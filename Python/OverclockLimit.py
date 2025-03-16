class OverclockLimit:
    def __init__(self, max_overclock):
        self._max_overclock = max_overclock

    def get_max_overclock(self):
        return self._max_overclock

    def set_max_overclock(self, max_overclock):
        self._max_overclock = max_overclock
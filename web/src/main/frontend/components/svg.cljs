(ns frontend.components.svg
  (:require [rum.core :as rum]))

(rum/defc arrow-down
  []
  [:svg
   {:aria-hidden "true",
    :height "16",
    :width "10",
    :version "1.1",
    :view-box "0 0 10 16"
    :fill "currentColor"
    :display "inline-block"}
   [:path
    {:d "M5 11L0 6l1.5-1.5L5 8.25 8.5 4.5 10 6l-5 5z",
     :fill-rule "evenodd"}]])

(rum/defc arrow-right
  []
  [:svg
   {:aria-hidden "true",
    :height "16",
    :width "10",
    :version "1.1",
    :view-box "0 0 10 16"
    :fill "currentColor"
    :display "inline-block"}
   [:path
    {:d "M7.5 8l-5 5L1 11.5 4.75 8 1 4.5 2.5 3l5 5z",
     :fill-rule "evenodd"}]])

(rum/defc big-arrow-right
  []
  [:svg
   {:fill "none", :view-box "0 0 24 24", :height "24", :width "24"}
   [:path
    {:stroke-linejoin "round",
     :stroke-linecap "round",
     :stroke-width "2",
     :stroke "currentColor",
     :d "M14 5L21 12M21 12L14 19M21 12L3 12"}]])

(rum/defc big-arrow-left
  []
  [:svg
   {:fill "none", :view-box "0 0 24 24", :height "24", :width "24"}
   [:path
    {:stroke-linejoin "round",
     :stroke-linecap "round",
     :stroke-width "2",
     :stroke "currentColor",
     :d "M10 19L3 12M3 12L10 5M3 12L21 12"}]])

(defn- hero-icon
  [d]
  [:svg
   {:fill "none", :view-box "0 0 24 24", :height "24", :width "24"}
   [:path
    {:stroke-linejoin "round"
     :stroke-linecap "round"
     :stroke-width "2"
     :stroke "currentColor"
     :d d}]])

(def close (hero-icon "M6 18L18 6M6 6L18 18"))
(def plus (hero-icon "M12 4v16m8-8H4"))

(rum/defc caret-down
  []
  [:svg
   {:aria-hidden "true",
    :height "12",
    :width "10",
    :version "1.1",
    :view-box "0 0 192 512"
    :fill "currentColor"
    :display "inline-block"
    :style {
            :margin-left -3
            :margin-top -1}}
   [:path
    {:d "M31.3 192h257.3c17.8 0 26.7 21.5 14.1 34.1L174.1 354.8c-7.8 7.8-20.5 7.8-28.3 0L17.2 226.1C4.6 213.5 13.5 192 31.3 192z",
     :fill-rule "evenodd"}]])

(rum/defc caret-right
  []
  [:svg
   {:aria-hidden "true",
    :height "12",
    :width "10",
    :version "1.1",
    :view-box "0 0 192 512"
    :fill "currentColor"
    :display "inline-block"
    :style {:margin-top -1}}
   [:path
    {:d "M0 384.662V127.338c0-17.818 21.543-26.741 34.142-14.142l128.662 128.662c7.81 7.81 7.81 20.474 0 28.284L34.142 398.804C21.543 411.404 0 402.48 0 384.662z",
     :fill-rule "evenodd"}]])

(rum/defc star-outline
  [class]
  [:svg
   {:fill "none", :view-box "0 0 24 24", :height "24", :width "24"
    :class class}
   [:path
    {:stroke-width 2
     :stroke "currentColor",
     :d
     "M11.0489 2.92707C11.3483 2.00576 12.6517 2.00576 12.9511 2.92707L14.4697 7.60083C14.6035 8.01285 14.9875 8.29181 15.4207 8.29181H20.335C21.3037 8.29181 21.7065 9.53143 20.9228 10.1008L16.947 12.9894C16.5965 13.244 16.4499 13.6954 16.5838 14.1074L18.1024 18.7812C18.4017 19.7025 17.3472 20.4686 16.5635 19.8992L12.5878 17.0107C12.2373 16.756 11.7627 16.756 11.4122 17.0107L7.43647 19.8992C6.65276 20.4686 5.59828 19.7025 5.89763 18.7812L7.41623 14.1074C7.5501 13.6954 7.40344 13.244 7.05296 12.9894L3.07722 10.1008C2.2935 9.53143 2.69628 8.29181 3.665 8.29181H8.57929C9.01251 8.29181 9.39647 8.01285 9.53034 7.60083L11.0489 2.92707Z"}]])

(rum/defc star-solid
  [class]
  [:svg
   {:fill "none", :view-box "0 0 20 20", :height "20", :width "20"
    :class class}
   [:path
    {:fill "currentColor",
     :d
     "M9.04893 2.92707C9.34828 2.00576 10.6517 2.00576 10.951 2.92707L12.0206 6.21886C12.1545 6.63089 12.5384 6.90985 12.9717 6.90985H16.4329C17.4016 6.90985 17.8044 8.14946 17.0207 8.71886L14.2205 10.7533C13.87 11.0079 13.7233 11.4593 13.8572 11.8713L14.9268 15.1631C15.2261 16.0844 14.1717 16.8506 13.3879 16.2812L10.5878 14.2467C10.2373 13.9921 9.76269 13.9921 9.4122 14.2467L6.61203 16.2812C5.82832 16.8506 4.77384 16.0844 5.07319 15.1631L6.14276 11.8713C6.27663 11.4593 6.12997 11.0079 5.77949 10.7533L2.97932 8.71886C2.1956 8.14946 2.59838 6.90985 3.5671 6.90985H7.0283C7.46153 6.90985 7.84548 6.63089 7.97936 6.21886L9.04893 2.92707Z"
     :stroke-width "1"}]]
  )

(rum/defc menu
  [class]
  [:svg
   {:fill "none", :view-box "0 0 20 20", :height "20", :width "20"
    :class class}
   [:path
    {:fill "currentColor",
     :d
     "M3 5C3 4.44772 3.44772 4 4 4H16C16.5523 4 17 4.44772 17 5C17 5.55228 16.5523 6 16 6H4C3.44772 6 3 5.55228 3 5Z",
     :clip-rule "evenodd",
     :fill-rule "evenodd"}]
   [:path
    {:fill "currentColor"
     :d
     "M3 10C3 9.44772 3.44772 9 4 9H16C16.5523 9 17 9.44772 17 10C17 10.5523 16.5523 11 16 11H4C3.44772 11 3 10.5523 3 10Z",
     :clip-rule "evenodd",
     :fill-rule "evenodd"}]
   [:path
    {:fill "currentColor",
     :d
     "M3 15C3 14.4477 3.44772 14 4 14H16C16.5523 14 17 14.4477 17 15C17 15.5523 16.5523 16 16 16H4C3.44772 16 3 15.5523 3 15Z",
     :clip-rule "evenodd",
     :fill-rule "evenodd"}]])

(defn excalidraw-logo
  []
  [:svg
   {:preserve-aspect-ratio "xMidYMid meet",
    :view-box "0 0 109.000000 269.000000",
    :height 24,
    :width 24,
    :version "1.0"}
   [:g
    {:stroke "none",
     :fill "currentColor",
     :transform
     "translate(0.000000,269.000000) scale(0.100000,-0.100000)"}
    [:path
     {:d
      "M393 2643 c-74 -59 -188 -159 -278 -245 l-71 -67 13 -88 c7 -48 20 -142 28 -208 9 -66 18 -128 21 -137 4 -12 0 -18 -11 -18 -19 0 -20 5 32 -160 19 -63 37 -121 39 -127 2 -7 10 -10 19 -7 9 4 14 12 11 19 -3 8 2 16 10 19 11 4 10 12 -7 41 -27 45 -96 429 -100 553 -3 88 -3 89 34 139 36 49 119 123 247 217 36 27 72 57 82 67 15 18 22 13 148 -121 73 -77 154 -156 180 -176 l48 -36 -37 -78 c-20 -42 -101 -204 -181 -358 -167 -324 -133 -293 -327 -296 l-126 -1 -42 -48 c-44 -51 -50 -70 -29 -102 8 -11 14 -29 14 -40 0 -18 7 -21 47 -23 25 -1 48 -4 51 -7 3 -3 7 -65 10 -138 l4 -132 -67 -144 c-111 -240 -155 -350 -155 -386 0 -19 4 -35 8 -35 10 0 10 1 417 850 189 394 368 765 398 826 30 61 57 117 59 125 2 9 -67 78 -177 175 -99 88 -186 168 -194 177 -23 28 -57 19 -118 -30z m34 -1150 c-46 -89 -48 -90 -174 -96 -111 -6 -113 -5 -113 16 0 12 -4 28 -9 36 -6 9 -2 25 12 47 l22 34 100 0 c55 1 118 5 140 9 22 4 41 6 43 5 2 -1 -8 -24 -21 -51z m-84 -160 c-8 -21 -29 -65 -46 -98 -28 -56 -31 -58 -38 -35 -4 14 -7 55 -8 92 -1 73 -3 72 81 77 l27 1 -16 -37z"}]
    [:path
     {:d
      "M423 2405 c-18 -13 -23 -26 -23 -59 0 -39 3 -45 30 -56 27 -11 34 -10 65 11 41 28 42 35 12 80 -26 39 -52 46 -84 24z m57 -36 c16 -28 6 -49 -24 -49 -27 0 -39 27 -24 54 12 22 35 20 48 -5z"}]
    [:path
     {:d
      "M1050 2180 c0 -5 -6 -10 -13 -10 -6 0 -23 -28 -36 -62 -40 -104 -440 -895 -441 -870 0 13 -6 22 -16 22 -14 0 -16 -8 -10 -47 6 -45 2 -55 -140 -331 -80 -157 -166 -321 -191 -365 -26 -46 -46 -96 -48 -117 -3 -36 1 -41 88 -116 50 -44 114 -99 142 -124 126 -115 185 -161 201 -158 24 4 395 393 396 415 0 10 -18 162 -40 338 -38 300 -74 651 -70 685 3 21 -12 127 -23 173 -9 36 -5 51 67 215 42 97 97 216 121 264 23 48 43 90 43 93 0 3 -7 5 -15 5 -8 0 -15 -4 -15 -10z m-230 -747 c11 -70 33 -238 49 -373 31 -248 67 -523 77 -593 6 -35 2 -42 -63 -114 -113 -127 -233 -252 -274 -284 l-38 -30 -195 182 c-180 166 -195 183 -184 203 6 11 57 104 113 206 56 102 130 238 164 302 35 65 67 121 73 124 7 4 9 -97 7 -312 -4 -321 -3 -322 29 -315 4 0 7 162 7 359 l0 358 105 210 c58 116 106 209 108 208 2 -1 12 -60 22 -131z"}]]]
)
